using Aspose.Words;

class ConvertFromPDF : IFileConverter
{
    private string defaultPath = IFileConverter.DEFAULT_PATH;
    public const string EXTENSION = ".pdf";

    private string outPutExtension = IFileConverter.OUTPUT_EXTENSION;

    public void Conversion(string fileName) {
        string inputFile = fileName + EXTENSION;
        string inputPath = Path.Combine(defaultPath, inputFile);
        string outputFile;
        string outputPath;

        var pdfDocument = new Document(inputPath);

        for (int i = 0; i < pdfDocument.PageCount; i++) {
            var extractedPage = pdfDocument.ExtractPages(i,1);
            outputFile = fileName + outPutExtension;
            outputPath = Path.Combine(defaultPath,outputFile);
            extractedPage.Save(outputPath);
        }
    }
}