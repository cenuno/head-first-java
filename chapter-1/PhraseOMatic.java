public class PhraseOMatic {
    public static void main(String[] args) {
        // NOTE: make three sets of words to choose from
        String[] wordListQuantity = {"ten", "twenty", "thirty"};
        String[] wordListNoun = {"towels", "boxes", "bags"};
        String[] wordListAdjective = {"fine", "coarse", "smooth"};

        // NOTE: find out how many words are in each list
        int quantityLength = wordListQuantity.length;
        int adjectiveLength = wordListAdjective.length;
        int nounLength = wordListNoun.length;

        // NOTE: generate three random numbers
        java.util.Random randomGenerator = new java.util.Random(); 
        int rand1 = randomGenerator.nextInt(quantityLength);
        int rand2 = randomGenerator.nextInt(adjectiveLength);
        int rand3 = randomGenerator.nextInt(nounLength);

        // NOTE: build a phrase
        String phrase = wordListQuantity[rand1] + " " + wordListAdjective[rand2] + " " + wordListNoun[rand3];
        
        // NOTE: print phrase to screent
        System.out.println("What we need is " + phrase + "!");
    }
}