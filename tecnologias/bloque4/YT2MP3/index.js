const readline = require("readline");
require("dotenv").config();
const { ValidateVideoIDHandler } = require("./ValidateVideoIdHandler");
const { FetchMp3DataHandler } = require("./FetchMp3DataHandler");
const { ParseYoutubeLinkHandler } = require("./ParseYoutubeLinkHandler");

const parseLinkHandler = new ParseYoutubeLinkHandler();
const validateVideoIDHandler = new ValidateVideoIDHandler();
const fetchHandler = new FetchMp3DataHandler();

parseLinkHandler.setNext(validateVideoIDHandler).setNext(fetchHandler);

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout,
});

console.log("Enter a YouTube link:");

rl.on("line", async (input) => {
    await parseLinkHandler.handle(input);
    rl.close();
});
