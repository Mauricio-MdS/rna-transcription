import java.util.Arrays;

class RnaTranscription {

    String transcribe(String dnaStrand) {
        StringBuilder rna = new StringBuilder();
        Arrays.stream(dnaStrand.split("")).forEach(nucleotide -> rna.append(transcribeNucleotide(nucleotide)));
        return rna.toString();
    }

    private String transcribeNucleotide(String dna) {
        return switch (dna) {
            case "G" -> "C";
            case "C" -> "G";
            case "T" -> "A";
            case "A" -> "U";
            default -> "";
        };
    }

}
