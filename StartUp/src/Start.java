import java.util.ArrayList;
import java.util.Random; 
public class Start {

  //       animals = new String[10];
         static String[] animals = { 
        		    "Dog", "cat", "Pig",
        		    "Horse", "Cow", "Elephant", 
        		    "Crocodile","Bull","Bird","Ant","Mouse"
        		};
         static String[] names = {
        		 "aron        "
        		,"Abbas       "
        		,"Abbe        "
        		,"Abdallah    "
        		,"Abdirahim   "
        		,"Abdirahman  "
        		,"Abdulahi    "
        		,"Abdullah    "
        		,"Abdullahi   "
        		,"Abdulrahman "
        		,"Abel        "
        		,"Abraham     "
        		,"Acke        "
        		,"Adam        "
        		,"Adel        "
        		,"Adem        "
        		,"Adian       "
        		,"Adil        "
        		,"Adin        "
        		,"Adis        "
        		,"Adnan       "
        		,"Adonay      "
        		,"Adrian      "
        		,"Adriano     "
        		,"Agaton      "
        		,"Agust       "
        		,"Ahmad       "
        		,"Ahmed       "
        		,"Aiden       "
        		,"Ajan        "
        		,"Ajdin       "
        		,"Akram       "
        		,"Aksel       "
        		,"Alan        "
        		,"Aland       "
        		,"Albert      "
        		,"Albin       "
        		,"Aldin       "
        		,"Alec        "
        		,"Alejandro   "
        		,"Aleksandar  "
        		,"Aleksander  "
        		,"Alen        "
        		,"Alessandro  "
        		,"Alessio     "
        		,"Alex        "
        		,"Alexander   "
        		,"Alexandros  "
        		,"Alexis      "
        		,"Alf         "
        		,"Alfons      "
        		,"Alfred      "
        		,"Algot       "
        		,"Ali         "
        		,"Allan       "
        		,"Almin       "
        		,"Almir       "
        		,"Altin       "
        		,"Alvar       "
        		,"Alve        "
        		,"Alvin       "
        		,"Alwin       "
        		,"Amadeus     "
        		,"Amandus     "
        		,"Amar        "
        		,"Amel        "
        		,"Amer        "
        		,"Amin        "
        		,"Amir        "
        		,"Ammar       "
        		,"Amos        "
        		,"Anakin      "
        		,"Anas        "
        		,"Anders      "
        		,"Andi        "
        		,"Andr�       "
        		,"Andreas     "
        		,"Andr�as     "
        		,"Andrej      "
        		,"Andrew      "
        		,"Andy        "
        		,"Anes        "
        		,"Angelo      "
        		,"Ante        "
        		,"Anthon      "
        		,"Anthony     "
        		,"Anton       "
        		,"Antoni      "
        		,"Antonio     "
        		,"Anwar       "
        		,"Aram        "
        		,"Aran        "
        		,"Aras        "
        		,"Arda        "
        		,"Arham       "
        		,"Ari         "
        		,"Arian       "
        		,"Arild       "
        		,"Arin        "
        		,"Arman       "
        		,"Armin       "
        		,"Arne        "
        		,"Arnold      "
        		,"Aron        "
        		,"Arthur      "
        		,"Artin       "
        		,"Artur       "
        		,"Arve        "
        		,"Arvid       "
        		,"Arwid       "
        		,"Arvin       "
        		,"Aryan       "
        		,"Assar       "
        		,"Aston       "
        		,"Astor       "
        		,"Atlas       "
        		,"Atle        "
        		,"August      "
        		,"Axel        "
        		,"Ayaan       "
        		,"Ayan        "
        		,"Ayaz        "
        		,"Ayman       "
        		,"Ayoub       "
        		,"Ayub        "
        		,"Ayuub       "
        		,"Aziz        "
        		,"Baran       "
        		,"Bastian     "
        		,"Ben         "
        		,"Benjamin    "
        		,"Bentley     "
        		,"Benyamin    "
        		,"Beppe       "
        		,"Berat       "
        		,"Bernard     "
        		,"Bertil      "
        		,"Bilal       "
        		,"Bill        "
        		,"Billy       "
        		,"Birger      "
        		,"Birk        "
        		,"Bj�rn       "
        		,"Bo          "
        		,"Bob         "
        		,"Bobby       "
        		,"Bobo        "
        		,"Boris       "
        		,"Bosse       "
        		,"Brandon     "
        		,"Brian       "
        		,"Bror        "
        		,"Bruno       "
        		,"Buster      "
        		,"Caesar      "
        		,"Calle       "
        		,"Carl        "
        		,"Carl-Johan  "
        		,"Carlos      "
        		,"Caspar      "
        		,"Casper      "
        		,"Caspian     "
        		,"Cazper      "
        		,"Ceasar      "
        		,"Cesar       "
        		,"Cevin       "
        		,"Charbel     "
        		,"Charles     "
        		,"Charlie     "
        		,"Chris       "
        		,"Christian   "
        		,"Christofer  "
        		,"Christoffer "
        		,"Christopher "
        		,"Christos    "
        		,"Claes       "
        		,"Colin       "
        		,"Collin      "
        		,"Conrad      "
        		,"Cornelis    "
        		,"Cornelius   "
        		,"Dag         "
        		,"Damian      "
        		,"Damien      "
        		,"Damon       "
        		,"Dan         "
        		,"Dani        "
        		,"Danial      "
        		,"Daniel      "
        		,"Danilo      "
        		,"Danny       "
        		,"Dante       "
        		,"Danyar      "
        		,"Darian      "
        		,"Darin       "
        		,"Dario       "
        		,"Daris       "
        		,"David       "
        		,"Dean        "
        		,"Denis       "
        		,"Deniz       "
        		,"Dennis      "
        		,"Denniz      "
        		,"Denver      "
        		,"Devin       "
        		,"Dewin       "
        		,"Dexter      "
        		,"Diar        "
        		,"Didrik      "
        		,"Diego       "
        		,"Diesel      "
        		,"Dilan       "
        		,"Dino        "
        		,"Dio         "
        		,"Dion        "
        		,"Dominic     "
        		,"Dominik     "
        		,"Dorian      "
        		,"Douglas     "
        		,"Dylan       "
        		,"Ebbe        "
        		,"Ebbot       "
        		,"Eddie       "
        		,"Eddy        "
        		,"Edgar       "
        		,"Edin        "
        		,"Edmond      "
        		,"Edmund      "
        		,"Edvard      "
        		,"Edward      "
        		,"Edvin       "
        		,"Edwin       "
        		,"Efe         "
        		,"Egil        "
        		,"Egon        "
        		,"Einar       "
        		,"Eje         "
        		,"Eldar       "
        		,"Eldin       "
        		,"Eli         "
        		,"Elia        "
        		,"Eliah       "
        		,"Elian       "
        		,"Elias       "
        		,"Eliaz       "
        		,"Elijah      "
        		,"Elion       "
        		,"Eliot       "
        		,"Elis        "
        		,"Ellion      "
        		,"Elliot      "
        		,"Ellioth     "
        		,"Elliott     "
        		,"Ellis       "
        		,"Elmer       "
        		,"Elmin       "
        		,"Elof        "
        		,"Elton       "
        		,"Elvin       "
        		,"Elwin       "
        		,"Elvis       "
        		,"Emad        "
        		,"Emanuel     "
        		,"Emil        "
        		,"Emilian     "
        		,"Emilio      "
        		,"Emin        "
        		,"Emir        "
        		,"Emmanuel    "
        		,"Emmet       "
        		,"Emmett      "
        		,"Emre        "
        		,"Emrik       "
        		,"Enar        "
        		,"Enes        "
        		,"Enok        "
        		,"Ensar       "
        		,"Enzo        "
        		,"Eren        "
        		,"Eric        "
        		,"Erik        "
        		,"Erion       "
        		,"Erjon       "
        		,"Erland      "
        		,"Ernst       "
        		,"Eskil       "
        		,"Ethan       "
        		,"Evald       "
        		,"Evan        "
        		,"Even        "
        		,"Evert       "
        		,"Eymen       "
        		,"Eyvind      "
        		,"Fabian      "
        		,"Fares       "
        		,"Felipe      "
        		,"Felix       "
        		,"Filip       "
        		,"Filiph      "
        		,"Finn        "
        		,"Florian     "
        		,"Folke       "
        		,"Francis     "
        		,"Frank       "
        		,"Franke      "
        		,"Franklin    "
        		,"Frans       "
        		,"Franz       "
        		,"Fred        "
        		,"Freddie     "
        		,"Freddy      "
        		,"Fredric     "
        		,"Fredrik     "
        		,"Frej        "
        		,"Frode       "
        		,"Gabriel     "
        		,"Georg       "
        		,"George      "
        		,"Georgios    "
        		,"Gideon      "
        		,"Gillis      "
        		,"Gordon      "
        		,"Gottfrid    "
        		,"Grim        "
        		,"Gunnar      "
        		,"Gustaf      "
        		,"Gustav      "
        		,"Gusten      "
        		,"G�sta       "
        		,"Hadi        "
        		,"Haidar      "
        		,"Hampus      "
        		,"Hamza       "
        		,"Hanad       "
        		,"Hannes      "
        		,"Hans        "
        		,"Harald      "
        		,"Haris       "
        		,"Harley      "
        		,"Harry       "
        		,"Harun       "
        		,"Hasan       "
        		,"Hassan      "
        		,"Hector      "
        		,"Hektor      "
        		,"Helge       "
        		,"Helmer      "
        		,"Henning     "
        		,"Henri       "
        		,"Henric      "
        		,"Henrik      "
        		,"Henry       "
        		,"Herbert     "
        		,"Herman      "
        		,"Hilding     "
        		,"Hilmer      "
        		,"Hjalmar     "
        		,"Holger      "
        		,"Hubert      "
        		,"Hugo        "
        		,"Hussein     "
        		,"H�kan       "
        		,"Ian         "
        		,"Ibrahim     "
        		,"Idris       "
        		,"Igor        "
        		,"Ilias       "
        		,"Ilon        "
        		,"Ilyas       "
        		,"Imran       "
        		,"Ingemar     "
        		,"Ingmar      "
        		,"Ingo        "
        		,"Isa         "
        		,"Isaac       "
        		,"Isac        "
        		,"Isak        "
        		,"Ishak       "
        		,"Isidor      "
        		,"Ismael      "
        		,"Ismail      "
        		,"Issa        "
        		,"Ivan        "
        		,"Ivar        "
        		,"Izak        "
        		,"Jack        "
        		,"Jackson     "
        		,"Jacob       "
        		,"Jad         "
        		,"Jake        "
        		,"Jakob       "
        		,"Jakub       "
        		,"Jamal       "
        		,"James       "
        		,"Jamie       "
        		,"Jamil       "
        		,"Jan         "
        		,"Jason       "
        		,"Jasper      "
        		,"Jax         "
        		,"Jaxon       "
        		,"Jayden      "
        		,"Jens        "
        		,"Jeremiah    "
        		,"Jeremy      "
        		,"Jerry       "
        		,"Jesper      "
        		,"Jesse       "
        		,"Jibril      "
        		,"Jim         "
        		,"Jimmie      "
        		,"Jimmy       "
        		,"Joachim     "
        		,"Joacim      "
        		,"Joakim      "
        		,"Joar        "
        		,"Joel        "
        		,"Johan       "
        		,"Johannes    "
        		,"John        "
        		,"Johnny      "
        		,"Jon         "
        		,"Jona        "
        		,"Jonah       "
        		,"Jonas       "
        		,"Jonatan     "
        		,"Jonathan    "
        		,"Jones       "
        		,"Jonny       "
        		,"Jordan      "
        		,"Josef       "
        		,"Joseph      "
        		,"Joshua      "
        		,"Joud        "
        		,"Julian      "
        		,"Julius      "
        		,"Junior      "
        		,"Justin      "
        		,"Kaan        "
        		,"Kacper      "
        		,"Kai         "
        		,"Kalle       "
        		,"Karam       "
        		,"Karim       "
        		,"Karl        "
        		,"Kaspar      "
        		,"Kasper      "
        		,"Kaspian     "
        		,"Kelian      "
        		,"Kelvin      "
        		,"Kenan       "
        		,"Kenny       "
        		,"Kerem       "
        		,"Kerim       "
        		,"Kevin       "
        		,"Kewin       "
        		,"Khaled      "
        		,"Khalid      "
        		,"Kian        "
        		,"Kid         "
        		,"Kilian      "
        		,"Killian     "
        		,"Kim         "
        		,"Kimi        "
        		,"Kingston    "
        		,"Kion        "
        		,"Klas        "
        		,"Knut        "
        		,"Konrad      "
        		,"Konstantin  "
        		,"Konstantinos"
        		,"Kristian    "
        		,"Kristoffer  "
        		,"Laban       "
        		,"Laith       "
        		,"Lars        "
        		,"Lasse       "
        		,"Leandro     "
        		,"Leart       "
        		,"Ledion      "
        		,"Lee         "
        		,"Lennon      "
        		,"Lennox      "
        		,"Leo         "
        		,"Leon        "
        		,"Le�n        "
        		,"L�on        "
        		,"Leonard     "
        		,"Leonardo    "
        		,"Leonel      "
        		,"Leonell     "
        		,"Leonidas    "
        		,"Leopold     "
        		,"Levi        "
        		,"Levin       "
        		,"Levis       "
        		,"Lewis       "
        		,"Lex         "
        		,"Lexus       "
        		,"Liam        "
        		,"Lian        "
        		,"Lias        "
        		,"Lincoln     "
        		,"Link        "
        		,"Linus       "
        		,"Lion        "
        		,"Lionel      "
        		,"Lo          "
        		,"Loa         "
        		,"Loah        "
        		,"Loe         "
        		,"Logan       "
        		,"Loke        "
        		,"Lorent      "
        		,"Lorentz     "
        		,"Lorenzo     "
        		,"Lorian      "
        		,"Lorik       "
        		,"Lou         "
        		,"Loui        "
        		,"Louie       "
        		,"Louis       "
        		,"Love        "
        		,"Lowe        "
        		,"Luan        "
        		,"Luca        "
        		,"Lucas       "
        		,"Lucaz       "
        		,"Ludvig      "
        		,"Ludwig      "
        		,"Luka        "
        		,"Lukas       "
        		,"Lukaz       "
        		,"Luke        "
        		,"Luqman      "
        		,"Maddox      "
        		,"Magnus      "
        		,"Mahamed     "
        		,"Mahdi       "
        		,"Maher       "
        		,"Mahir       "
        		,"Mahmoud     "
        		,"Maksim      "
        		,"Malcolm     "
        		,"Malcom      "
        		,"Malek       "
        		,"Malik       "
        		,"Malte       "
        		,"Manfred     "
        		,"Manne       "
        		,"Manuel      "
        		,"Marc        "
        		,"Marcel      "
        		,"Marcelo     "
        		,"Marco       "
        		,"Marcus      "
        		,"Mario       "
        		,"Marius      "
        		,"Mark        "
        		,"Marko       "
        		,"Markus      "
        		,"Marley      "
        		,"Marlon      "
        		,"Martin      "
        		,"Marwan      "
        		,"Marvin      "
        		,"Marwin      "
        		,"Mason       "
        		,"Masud       "
        		,"Mateo       "
        		,"Matheo      "
        		,"Matheus     "
        		,"Mathias     "
        		,"Matin       "
        		,"Mats        "
        		,"Matteo      "
        		,"Matteus     "
        		,"Matthew     "
        		,"Matthias    "
        		,"Matti       "
        		,"Mattias     "
        		,"Mattis      "
        		,"Mauritz     "
        		,"Max         "
        		,"Maxim       "
        		,"Maximiliam  "
        		,"Maximilian  "
        		,"Maximillian "
        		,"Maximus     "
        		,"Maxwell     "
        		,"Mayar       "
        		,"Mehdi       "
        		,"Mehmet      "
        		,"Melker      "
        		,"Melvin      "
        		,"Melwin      "
        		,"Mert        "
        		,"Michael     "
        		,"Michel      "
        		,"Miguel      "
        		,"Mika        "
        		,"Mikael      "
        		,"Mikail      "
        		,"Mike        "
        		,"Milad       "
        		,"Milan       "
        		,"Milas       "
        		,"Mileon      "
        		,"Miliam      "
        		,"Milian      "
        		,"Milio       "
        		,"Mille       "
        		,"Million     "
        		,"Milo        "
        		,"Milton      "
        		,"Mingus      "
        		,"Mio         "
        		,"Mir         "
        		,"Miran       "
        		,"Miro        "
        		,"Mohamad     "
        		,"Mohamed     "
        		,"Mohammad    "
        		,"Mohammed    "
        		,"Moltas      "
        		,"Morgan      "
        		,"Morris      "
        		,"Moses       "
        		,"Mostafa     "
        		,"Muad        "
        		,"Muhamed     "
        		,"Muhammad    "
        		,"Muhammed    "
        		,"Munasar     "
        		,"Munir       "
        		,"Musa        "
        		,"Musab       "
        		,"Mustafa     "
        		,"M�ns        "
        		,"M�rten      "
        		,"Nabil       "
        		,"Nahom       "
        		,"Natan       "
        		,"Natanael    "
        		,"Nathan      "
        		,"Nathanael   "
        		,"Nathaniel   "
        		,"Natnael     "
        		,"Nelson      "
        		,"Nemo        "
        		,"Neo         "
        		,"Nicholas    "
        		,"Nick        "
        		,"Nicklas     "
        		,"Niclas      "
        		,"Nico        "
        		,"Nicolai     "
        		,"Nicolas     "
        		,"Niklas      "
        		,"Nikola      "
        		,"Nikolai     "
        		,"Nikolaj     "
        		,"Nikolas     "
        		,"Nilas       "
        		,"Nilo        "
        		,"Nils        "
        		,"Nima        "
        		,"Nino        "
        		,"Noa         "
        		,"Noah        "
        		,"Noak        "
        		,"Noam        "
        		,"Noar        "
        		,"Noel        "
        		,"Nore        "
        		,"Norton      "
        		,"Novak       "
        		,"Odd         "
        		,"Oden        "
        		,"Odin        "
        		,"Ola         "
        		,"Oliver      "
        		,"Oliwer      "
        		,"Olivier     "
        		,"Olle        "
        		,"Olliver     "
        		,"Olof        "
        		,"Olov        "
        		,"Omar        "
        		,"Omer        "
        		,"Oscar       "
        		,"Oskar       "
        		,"Osman       "
        		,"Ossian      "
        		,"Otis        "
        		,"Otto        "
        		,"Owen        "
        		,"Ozzy        "
        		,"Pascal      "
        		,"Patric      "
        		,"Patrick     "
        		,"Patrik      "
        		,"Paul        "
        		,"Pelle       "
        		,"Per         "
        		,"Peter       "
        		,"Petrus      "
        		,"Petter      "
        		,"Philip      "
        		,"Phoenix     "
        		,"Pierre      "
        		,"Pontus      "
        		,"P�r         "
        		,"Rafael      "
        		,"Ragnar      "
        		,"Ralf        "
        		,"Ralph       "
        		,"Ramadan     "
        		,"Raman       "
        		,"Rami        "
        		,"Rasmus      "
        		,"Rayan       "
        		,"Razmus      "
        		,"Rex         "
        		,"Richard     "
        		,"Rickard     "
        		,"Ricky       "
        		,"Ridwan      "
        		,"Rikard      "
        		,"Rio         "
        		,"River       "
        		,"Robert      "
        		,"Roberto     "
        		,"Robin       "
        		,"Roger       "
        		,"Roman       "
        		,"Romeo       "
        		,"Roni        "
        		,"Roy         "
        		,"Ruben       "
        		,"Rufus       "
        		,"Rune        "
        		,"Ryan        "
        		,"Said        "
        		,"Saif        "
        		,"Sakarias    "
        		,"Salim       "
        		,"Salmaan     "
        		,"Salman      "
        		,"Sam         "
        		,"Sami        "
        		,"Samir       "
        		,"Sammy       "
        		,"Samuel      "
        		,"Sander      "
        		,"Santiago    "
        		,"Santino     "
        		,"Scott       "
        		,"Sean        "
        		,"Sebastian   "
        		,"Selim       "
        		,"Seth        "
        		,"Shayan      "
        		,"Sid         "
        		,"Sigge       "
        		,"Sigurd      "
        		,"Sigvard     "
        		,"Silas       "
        		,"Simon       "
        		,"Sixten      "
        		,"Sonny       "
        		,"Stefan      "
        		,"Stellan     "
        		,"Sten        "
        		,"Steven      "
        		,"Stig        "
        		,"Sture       "
        		,"Sune        "
        		,"Svante      "
        		,"Sven        "
        		,"Sylvester   "
        		,"Tage        "
        		,"Taha        "
        		,"Taim        "
        		,"Tarik       "
        		,"Taym        "
        		,"Ted         "
        		,"Teddy       "
        		,"Teo         "
        		,"Teodor      "
        		,"Texas       "
        		,"Theo        "
        		,"Theodor     "
        		,"Theodore    "
        		,"Thiago      "
        		,"Thim        "
        		,"Thomas      "
        		,"Thor        "
        		,"Thure       "
        		,"Tiam        "
        		,"Tiger       "
        		,"Tim         "
        		,"Timmie      "
        		,"Timmy       "
        		,"Timo        "
        		,"Timothy     "
        		,"Tino        "
        		,"Tintin      "
        		,"Titus       "
        		,"Tobias      "
        		,"Todd        "
        		,"Tom         "
        		,"Tomas       "
        		,"Tommy       "
        		,"Tony        "
        		,"Tor         "
        		,"Tore        "
        		,"Torsten     "
        		,"Totte       "
        		,"Travis      "
        		,"Tristan     "
        		,"Troy        "
        		,"Truls       "
        		,"Ture        "
        		,"Tyko        "
        		,"Tyler       "
        		,"Tyr         "
        		,"Uno         "
        		,"Valde       "
        		,"Valdemar    "
        		,"Waldemar    "
        		,"Valentin    "
        		,"Valentino   "
        		,"Walid       "
        		,"Valle       "
        		,"Valter      "
        		,"Walter      "
        		,"Walther     "
        		,"Victor      "
        		,"Wictor      "
        		,"Vidar       "
        		,"Widar       "
        		,"Vide        "
        		,"Viggo       "
        		,"Wiggo       "
        		,"Vigor       "
        		,"Viking      "
        		,"Viktor      "
        		,"Wiktor      "
        		,"Vilde       "
        		,"Wilde       "
        		,"Vile        "
        		,"Wilfred     "
        		,"Vilgot      "
        		,"Wilgot      "
        		,"Vilhelm     "
        		,"Wilhelm     "
        		,"Ville       "
        		,"Wille       "
        		,"Villiam     "
        		,"William     "
        		,"Willy       "
        		,"Vilmer      "
        		,"Wilmer      "
        		,"Vilton      "
        		,"Wilton      "
        		,"Vince       "
        		,"Vincent     "
        		,"Wincent     "
        		,"Vinston     "
        		,"Winston     "
        		,"Xander      "
        		,"Yahya       "
        		,"Yahye       "
        		,"Yakup       "
        		,"Yaman       "
        		,"Yamen       "
        		,"Yasin       "
        		,"Yasir       "
        		,"Yassin      "
        		,"Yazan       "
        		,"Yones       "
        		,"Yonis       "
        		,"Yosef       "
        		,"Younes      "
        		,"Yousef      "
        		,"Yousif      "
        		,"Youssef     "
        		,"Yousuf      "
        		,"Yunus       "
        		,"Yusuf       "
        		,"Zacharias   "
        		,"Zack        "
        		,"Zackarias   "
        		,"Zaid        "
        		,"Zain        "
        		,"Zakaria     "
        		,"Zakarias    "
        		,"Zakariya    "
        		,"Zakk        "
        		,"Zander      "
        		,"Zeb         "
        		,"Zebastian   "
        		,"Zeke        "
        		,"Zion        "
        		,"�ke         "
        		,"�mer        "};
         static Random rand = new Random();
         static int x=0;
         static ArrayList<Animal> zoo = new ArrayList<Animal>();
         
	public static void main(String[] args) {
		System.out.println("Hello");
        System.out.println(show1());
        Simple s1 = new Simple();
        Simple s2 = new Simple(3);
        Simple s3 = new Simple(99999);
        System.out.println(s1.a+ " " +s1.f);
        System.out.println(s2.a+ " " +s2.f);
        System.out.println(s3.a+ " " +s3.f);
           
        while (x<rand.nextInt(100)){
        createAnimals(x, rand.nextInt(10),names[rand.nextInt(908)]);
        x++;}
        
     
      //  for (Animal z : zoo)
      //     System.out.print( z.getTyp());
      //     System.out.println();
	}

		
	//Method Create animals
	
			private static void createAnimals(int no,int antype, String name){
				
			zoo.add(new Animal(animals[antype],name,rand.nextInt(1000)));
			}
			
	
	private static int show1(){
		return 1;
	}
		
	}

//Another class in same file
class Simple{  
	// Variable declaration
	int a=10;  
	 float f=a;
	 int showConst;
	 static int instCnt =0;
	 //Constructor 1
      Simple(){   
    	  show(1);
    	  instCnt++;
		}
      
    //Constructor 2 	
      Simple(int b){
    	  this.a=b;
    	  show(2);
    	  instCnt++;
		}  
	 // method show   
		static void show(int g){
			System.out.println("call from class "+ g + " No of inst= " + instCnt);
		}
		
		
		
		
	}  

