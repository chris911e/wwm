package zli.ch;

public class wwm {

        private int gewinn;
        private boolean failed = false;

        private int gewinne[] = {0, 100, 250, 1000, 5000, 10000, 25000, 50000, 100000, 250000, 500000, 1000000};

        private String fragen[] = {
                "3Was ist 1+1?\n(1)5\n(2)3\n(3)2\n(4)9",
                "4Ist ein Elefant ein Tier?\n(1)nein\n(2)vielleicht\n(3)ich weiss nicht\n(4)ja",
                "3Wann startete der 2. Weltkrieg?\n(1)1881\n(2)2005\n(3)1939\n(4)1422",
                "4Wer zeigt einem, wann man an der Strasse stehen bleiben muss und wann man gehen darf?\n(1)Der liebe Gott\n(2)Die Oma neben einem\n(3)Die neue Weltordnung\n(4)Das Ampelmännchen",
                "1Sprichwort: Wer im Glashaus sitzt, soll nicht ...?\n(1)mit Steinen werfen\n(2)in der Nase bohren\n(3)auf Toilette gehen\n(4)an Sonnencreme sparen",
                "2Wo gibt es R- und S-Sätze?\n(1)In der Bibel\n(2)In der Chemie\n(3)In Comics\n(4)In Benimmbüchern (Knigge)",
                "1Was ist das \"Bewimperte Mannsschild\"?\n(1)eine Alpenpflanze\n(2)Werkzeug beim Kohlebergbau\n(3)ein Sternbild\n(4)ein tektonisch stabiles Gebiet",
                "4Was geht namentlich nicht auf eine Person zurück, die wirklich gelebt hat?\n(1)Guinnessbuch\n(2)Brockhaus\n(3)Duden\n(4)Atlas",
                "4Wie heisst die von Rudolf Steiner in Dornach bei Basel gegründete Hochschule?\n(1)Schillerschule\n(2)Augustinum\n(3)Steinerium\n(4)Goetheanum",
                "2Wie ist der Name von Hello Kittys Hauskatze?\n(1)Chococat\n(2)Charmmy Kitty\n(3)Sugar\n(4)Schabliu",
                "2Wer verübte 1968 ein Attentat auf Andy Warhol?\n(1)John Hinckley junior\n(2)Valerie Solanas\n(3)Sara Jane Moore\n(4)Adelheid Streidel"
        };

        public int getGewinn () {
            return this.gewinn;
        }

        public void setGewinn (int num){
            this.gewinn = gewinne[num];
        }

        public String getQuestion(int num) {
            return fragen[num];
        }

        public void setFailed(boolean failed){
            this.failed = failed;
        }

        public boolean getFailed(){
            return failed;
        }

}
