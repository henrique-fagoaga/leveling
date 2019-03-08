public class TestProgrammingLanguage {
    public static void main(String[] args) {
        ProgrammingLanguage python = new ProgrammingLanguage("multiparadigm", "Guido", "interpreted");

        System.out.println(python.getParadigm());
        System.out.println(python.getCreator());
        System.out.println(python.getTypeCategory());

        python.setParadigm("superparadigm");
        python.setCreator("Yoda");
        python.setTypeCategory("mental type");

        System.out.println(python.getParadigm());
        System.out.println(python.getCreator());
        System.out.println(python.getTypeCategory());

        python.interpret();
        python.compile();
        python.lint();
    }
}
