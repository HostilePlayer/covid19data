public class Covid19Data {

    public void loadLineOfData(String input){
        String[] inputSplit = input.split(";");

        if (!inputSplit[2].contains(" ")){
            //"Region";"Aldersgruppe";"Bekræftede tilfælde i alt";"Døde";"Indlagte på intensiv afdeling";"Indlagte";"Dato"
            String Region = inputSplit[0];
            String AldersGruppe = inputSplit[1];
            int BekræftedeTilfældeIAlt = Integer.parseInt(inputSplit[2]);
            int Døde = Integer.parseInt(inputSplit[3]);
            int IndlagtePåIntensivAfdeling = Integer.parseInt(inputSplit[4]);
            int Indlagte = Integer.parseInt(inputSplit[5]);
            String Dato = inputSplit[6];

            System.out.println("|Region: " + Region + " |Aldersgruppe: " + AldersGruppe + " |Bekræftede tilfælde i alt: " + BekræftedeTilfældeIAlt + " |Døde: " + Døde
                    + " |Indlagte på intensiv afdeling: " + IndlagtePåIntensivAfdeling + " |Indlagte: " + Indlagte + " |Dato: " + Dato);
        }

    }
}
