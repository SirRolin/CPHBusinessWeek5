package Task1;

public class Customer {
    private String firstName;
    private String middleNames = "";
    private String lastName;
    private String userName;
    private int ID;
    private static int Count;
    public Customer(String name, String userName){
        //// ID population
        ID = Count;
        Count++;

        //// firstName middleName and LastName population
        String[] splitName = name.split(" ");
        this.firstName = splitName[0];
        if(splitName.length>1) {
            this.lastName = splitName[splitName.length-1];
            if(splitName.length>2){
                for(int i = 1; i < splitName.length-2; i++){
                    this.middleNames += splitName[i];
                }
            }
        } else {
            this.lastName = "";
        }

        ////userName population
        this.userName = userName;
    }

    @Override
    public String toString(){
        return "ID: " + ID
                + " - Username: " + userName
                + " - name: " + firstName + (middleNames.length()>0?" " + middleNames:"")  + (lastName.length()>0?" " + lastName:"");
    }
}
