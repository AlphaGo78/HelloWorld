package demo01;

/**
 * 蛋白质具有以下品质：
 * It begins with a “start codon”: ATG.
 * 它以“起始密码子”开头： ATG .
 * It ends with a “stop codon”: TGA.
 * 它以“终止密码子”结尾： TGA 。
 * In between, each additional codon is a sequence of three nucleotides.
 * 在两者之间，每个额外的密码子都是三个核苷酸的序列。
 */
public class DNA {
    public static void main(String[] args) {
        String dna1 = "ATGCGATACGCTTGA";
        String dna2 = "ATGCGATACGTGA";
        String dna3 = "ATTAATATGTACTGA";
        String[] dnas = {dna1, dna2, dna3};

        for (String dna : dnas) {
            int b = dna.indexOf("ATG");
            int e = dna.indexOf("TGA");
            if (b == -1 || e == -1
                    || dna.substring(b, e).length() % 3 != 0) {
                System.out.println("Does not contain a protein.");
            } else {
                System.out.println("Contains a protein.");
            }
        }
    }
}
