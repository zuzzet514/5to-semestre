class DocxFactory:IFileFactory 
{

    public IFileConverter InitializeConverter() {
        return new ConvertToDoc();
    }

    public string GetExtension () {
        return ConverToDoc.EXTENSION;
    }
}