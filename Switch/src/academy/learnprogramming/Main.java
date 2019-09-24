package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	int switchValue = 1;
	switch(switchValue){
        case 1:
            System.out.println("Value was 1");
            break;
        case 2:
            System.out.println("Value was 2");
            break;
        case 3: case 4: case 5:
            System.out.println("Value was 2, or 4, or a 5");
            System.out.println("Actually it was a " + switchValue);
            break;
        default:
            System.out.println("Value was not 1, 2, 3, 4 or 5");
            break;    // last break of the switch case is not required. But it's a good practice.
    }

    char newSwitchValue = 'D';
	switch(newSwitchValue){
        case 'A':
            System.out.println("A was found");
            break;
        case 'B':
            System.out.println("B was found");
            break;
        case 'C': case 'D':case 'E':
            System.out.println(newSwitchValue + " was found");
            break;
        default:
            System.out.println("not found");
            break;
    }

    String month = "january";  // This value is case-sensitive. January != january.
	switch (month.toLowerCase()) {  //converts all uppercase to lowercase (toUpperCase)
        case "january":
            System.out.println("Jan");
            break;
        case "june":
            System.out.println("Jun");
            break;
        default:
            System.out.println("Not sure");
            break;
    }
    }
}
