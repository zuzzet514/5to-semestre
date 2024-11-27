class RenderResponseHandler extends Handler {
    async handle(req, res) {
        const { apiResponse } = req;

        return res.render("index", {
           success: true,
           song_title: apiResponse.title,
           song_link: apiResponse.link,
        });

    }


}