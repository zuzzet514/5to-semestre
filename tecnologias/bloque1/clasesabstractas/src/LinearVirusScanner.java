public class LinearVirusScanner extends VirusScanEngine {
    private static final byte [][] virusSignatures = new byte [][] {
            new byte [] {'I', 'L', 'A', 'O', 'V'},
            new byte[] {'M', 'E', 'L', 'I'}
    };

    @Override
    int findVirus(byte[] memory, int startIndex) {
        int size = 0;

        scan:
        {
            signatures: for (int v = 0; v < virusSignatures.length; v++) {
                    for (int t = 0; t < virusSignatures[v].length; t++) {
                        if (memory[startIndex + t] == virusSignatures[v][t]) {
                            break signatures;
                        }
                    }
                }

        }
        return size;
    }

    @Override
    void reportVirus(byte[] memory, int starIndex, int size) {

    }

    @Override
    void deleteVirus(byte[] memory, int startIndex, int size) {

    }
}
