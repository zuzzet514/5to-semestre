const Handler = require("./Handler");
const fetch = require("node-fetch");

class FetchMp3DataHandler extends Handler{
    async handle(videoId) {
        try {
            const response = await fetch(
                `https://youtube-mp36.p.rapidapi.com/dl?id=${videoId}`,
                {
                    method: "GET",
                    headers: {
                        "x-rapidapi-key": process.env.API_KEY,
                        "x-rapid-host": process.env.API_HOST,
                    },
                }
            );

            const data = await response.json();
            console.log("API Response:", data);

            if (data.status === "ok") {
                console.log(`Song Title: ${data.title}`);
                console.log(`Fetching MP3 download link...`);

                // Pass the metadata to the next handler
                return super.handle({
                    title: data.title,
                    link: data.link,
                });
            } else if (data.msg === "in queue") {
                console.warn("Video is in queue. Please try again later.");
            } else {
                console.error(`Error: ${data.msg}`);
            }
        } catch (error) {
            console.error("Error fetching API data:", error.message);
        }
    }



}
module.exports = { FetchMp3DataHandler };