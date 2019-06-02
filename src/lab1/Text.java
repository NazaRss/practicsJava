package lab1;

public class Text {

    private String text;

    public Text(String s) {
        this.text = s;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getStr() {
        return this.text;
    }

    public void print() {
        System.out.println(this.text);
    }

    public Text() {

    }

    public int calcPunct() {
        int kol = 0;
        for (int i = 0; i < text.length(); i++) {
            if (this.text.charAt(i) == (',') | this.text.charAt(i) == ('.')) {
                kol++;
            }
        }
        return kol;
    }

    public void printPunct() {
        System.out.println("Количество знаков препинания: " + calcPunct());
    }

    public void strk() {

        String tr = text.trim();
        tr = tr + " ";

        String fst = "";
        String result = "";

        int pr = 0;

        tr = tr.replaceAll("\\.", " ");
        tr = tr.replaceAll(",", " ");
        while (tr.indexOf("  ") > 0) {
            tr = tr.replaceAll("  ", " ");
        }

        for (int i = 0; i < tr.length(); i++) {
            if (tr.charAt(i) == (' ')) {

                fst = tr.substring(pr, i); 

                if (fst.charAt(0) == fst.charAt(fst.length() - 1)) {
                    result = result + " " + fst;
                }
                pr = i + 1;

                fst = "";
            }
        }
        
        this.text = result.trim();
    }
}
