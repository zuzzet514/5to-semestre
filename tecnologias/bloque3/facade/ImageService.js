import fs from 'fs';
import axios from 'axios';

export class ImageService {
    async downloadImage(links,path) {
        for (const [i,link] of links.entries()) {
            try {
                const response = await axios({
                    method: 'GET',
                    url:link,
                    responseType: 'stream'
                })
                if (response.status !== 200) {
                    console.error(`Error syayus code ${response.status} for iamhge ${link}`)
                    continue
                }
                const fileStream = fs.createwriterStream()

                await new Promise((resolve, reject) => {
                    fileStream.on('finish', ()=> {
                        console.log(`pagina ${}`)
                    })
                })
            }
        }
    }

}