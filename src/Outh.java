public class Outh {
    private String cheie;

    public Outh(String abcd) {
    }

    @Override
    public String toString() {
        return "Outh{" +
                "cheie='" + cheie + '\'' +
                '}';
    }

    public boolean Logare(){
        boolean digit = false;
        int letters = 0;
        for(int i=0;i<cheie.length();i++){
            if(cheie.charAt(i) >= '0' && cheie.charAt(i) <= '9'){
                digit = true;
            } else if(cheie.charAt(i) >= 'a' && cheie.charAt(i) <= 'z' ||
                      cheie.charAt(i) >= 'A' && cheie.charAt(i) <= 'Z')
                letters++;
        }
        if(digit && letters >= 6)
                return true;
        return false;
    }

    public boolean iesireCont(){
        return(true);
    }
}
