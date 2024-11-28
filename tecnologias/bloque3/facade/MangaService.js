import axios from "axios";

export class MangaService {
    #URL
    constructor() {
        this.#URL = 'https://api.mangadex.org';
    }

    async getMangas(tittle) {
        const filters = {
            tittle: tittle,
            availableTranslatedLanguage:['es-la', 'es', 'en']
        }
        try {
            const response = await axios({
                method: 'GET',
                url: `${this.#URL/manga}`,
                params: filters
            })
            const mangas_information = response.data.data.map((manga) => ({
                title: manga.attributes.title,
                id: manga.id,
                attributes: manga.attributes
            }))
            return mangas_information;
        } catch (error) {
            console.error('Error fetching mangas: ', error);
            return {};
        }

    }
}

export default MangaService;