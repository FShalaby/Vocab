package com.javageeks.vocab;

public class Dictionary {
    private final String category;
    public  final String[] words;
    private final String[] definitions;

    public Dictionary(String category) {
        this.category = category;

        if (this.category.equals("Sports")) {
            this.words = new String[]{"Soccer", "BasketBall", "Baseball","Football","Hockey","Lacrosse","Wrestling","Boxing","MMA","Tennis","VolleyBall","Badminton","Swimming","Archery","Fencing","Skiing","Rugby","Track & Field","Gymnastics","Figure Skating","Golf"};
            this.definitions = new String[]{"a game played by two teams of eleven players with a round ball that may not be touched with the hands or arms during play except by the goalkeepers. The object of the game is to score goals by kicking or heading the ball into the opponents' goal." , "a game played between two teams of five players in which goals are scored by throwing a ball through a netted hoop fixed above each end of the court." , "a ball game played between two teams of nine on a field with a diamond-shaped circuit of four bases." , "a form of team game played with an oval ball on a field marked out as a gridiron. Points are scored mainly through touchdowns and field goals. Each side has eleven players on the field at any time." , " a game played on ice or in a field by two teams who try to drive a puck or ball through a goal by hitting it with a stick" , "a team game, originally played by North American Indians, in which the ball is thrown, caught, and carried with a long-handled stick having a curved L-shaped or triangular frame at one end with a piece of shallow netting in the angle." , "the sport or activity of grappling with an opponent and trying to throw or hold them down on the ground, typically according to a code of rules." , "the sport or practice of fighting with the fists, especially with padded gloves in a roped square ring according to prescribed rules." , "mixed martial arts (MMA), hybrid combat sport incorporating techniques from boxing, wrestling, judo, jujitsu, karate, Muay Thai (Thai boxing), and other disciplines" , "a game in which two or four players strike a ball with rackets over a net stretched across a court. The usual form (originally called lawn tennis ) is played with a felt-covered hollow rubber ball on a grass, clay, or artificial surface." , "a game for two teams, usually of six players, in which a large ball is hit by hand over a high net, the aim being to score points by making the ball reach the ground on the opponent's side of the court" , "a game with rackets in which a shuttlecock is played back and forth across a net." , "the sport or activity of propelling oneself through water using the limbs." , "the sport or skill of shooting with a bow and arrows, especially at a target." , "the sport of fighting with swords, especially foils, épées, or sabers, according to a set of rules, in order to score points against an opponent." , "the action of traveling over snow on skis, especially as a sport or recreation. Competitive skiing falls into two categories: Nordic (cross-country racing, jumping, and biathlon) and Alpine (downhill or straight racing, and slalom racing around a series of markers)." , "a team game played with an oval ball that may be kicked, carried, and passed from hand to hand. Points are scored by grounding the ball behind the opponents' goal line (thereby scoring a try) or by kicking it between the two posts and over the crossbar of the opponents' goal." , "athletic events that take place on a running track and a nearby field; track events and field events." , "exercises developing or displaying physical agility and coordination. The modern sport of gymnastics typically involves exercises on uneven bars, balance beam, floor, and vaulting horse (for women), and horizontal and parallel bars, rings, floor, and pommel horse (for men)." , "the competitive sport of ice skating in prescribed patterns ( figures ) and choreographed free skating." , "a game played on a large open-air course, in which a small hard ball is struck with a club into a series of small holes in the ground, the object being to use the fewest possible strokes to complete the course."};
        }
        else if (this.category.equals("Transportation")) {
            this.words = new String[]{"Car","Bus","Train","Airplane","Helicopter","Boat","Bicycle","Roller Blades","Scooter","Subway","Skateboard","Raft","Taxicab","Motorcycle"};
            this.definitions = new String[]{"a four-wheeled road vehicle that is powered by an engine and is able to carry a small number of people." , "a large motor vehicle carrying passengers by road, typically one serving the public on a fixed route and for a fare" , "a series of railroad cars moved as a unit by a locomotive or by integral motors." , "a powered flying vehicle with fixed wings and a weight greater than that of the air it displaces." , "a type of aircraft which derives both lift and propulsion from one or more sets of horizontally revolving overhead rotors. It is capable of moving vertically and horizontally, the direction of motion being controlled by the pitch of the rotor blades." , "a small vessel propelled on water by oars, sails, or an engine." , "a vehicle composed of two wheels held in a frame one behind the other, propelled by pedals and steered with handlebars attached to the front wheel." , "a brand name for a boot with a single row of small wheels on the bottom that you wear in order to travel along quickly for enjoyment." , "a vehicle typically ridden as a recreation, consisting of a footboard mounted on two wheels and a long steering handle, propelled by resting one foot on the footboard and pushing the other against the ground." , "Rapid transit or mass rapid transit, also known as heavy rail, metro, subway, tube, or underground, is a type of high-capacity public transport generally found in urban areas" , "a short narrow board with two small wheels fixed to the bottom of either end, on which (as a recreation or sport) a person can ride in a standing or crouching position, propelling themselves by occasionally pushing one foot against the ground." ,"a flat buoyant structure of timber or other materials fastened together, used as a boat or floating platform." , "a car licensed to transport passengers in return for payment of a fare, usually fitted with a taximeter." , "a two-wheeled vehicle that is powered by a motor and has no pedals."};
        }
        else if (this.category.equals("Summer")) {
            this.words = new String[]{"Sun","Beach","Jet Skiing","Fishing","Sand","Water","Lemonade","Fruit","Ice","Shorts","T-Shirts","Camping","Sea Cruise","Kayaking","Surfing","Vacation","Hot Weather","Hiking"};
            this.definitions = new String[]{"the star around which the earth orbits." , "a pebbly or sandy shore, especially by the ocean between high- and low-water marks.", "Riding on a small jet-propelled vehicle that skims across the surface of water and typically is ridden like a motorcycle." , "the activity of catching fish, either for food or as a sport." , "a loose granular substance, typically pale yellowish brown, resulting from the erosion of siliceous and other rocks and forming a major constituent of beaches, riverbeds, the seabed, and deserts." , "a stretch or area of water, such as a river, sea, or lake." , "a drink made from lemon juice and sweetened water." , " the sweet and fleshy product of a tree or other plant that contains seed and can be eaten as food." , "frozen water, a brittle transparent crystalline solid." , "short pants that reach only to the thighs or knees." , "a short-sleeved casual top, generally made of cotton, having the shape of a T when spread out flat." , "the activity of spending a vacation living in a camp, tent, or camper." , "Cruising by boat is an activity that involves living for extended time on a vessel while traveling from place to place for pleasure." , "Kayaking is the use of a kayak for moving over water. It is distinguished from canoeing by the sitting position of the paddler and the number of blades on the paddle." , "the sport or pastime of riding a wave towards the shore while standing or lying on a surfboard." , "A vacation, or holiday, can mean taking a leave of absence from a regular job or leisure travel away from home." , "a period of unusually high temperatures" , "the activity of going for long walks, especially in the country or woods."};
        }
        else if (this.category.equals("Winter")) {
            this.words = new String[]{"Cold Weather","Snow","Wind","Snowman","Hot Chocolate","S’mores","Christmas","Gifts","Holidays","CampFires","Ice Sculptures","Sledding”,”Freezing"};
            this.definitions = new String[]{"a period of unusually cold weather" , "atmospheric water vapor frozen into ice crystals and falling in light white flakes or lying on the ground as a white layer." , "the perceptible natural movement of the air, especially in the form of a current of air blowing from a particular direction." , "a representation of a human figure created with compressed snow." , "a hot drink made with milk or water and chocolate or powdered chocolate." , "a sweet snack consisting of a chocolate bar and toasted marshmallows sandwiched between graham " , "the annual Christian festival celebrating Christ's birth, held on December 25 in the Western Church." , "a thing given willingly to someone without payment; a present." , "a day of festivity or recreation when no work is done." , "an open-air fire in a camp, used for cooking and as a focal point for social activity." , " is a form of sculpture that uses ice as the raw material. Sculptures from ice can be abstract or realistic and can be functional or purely decorative. Ice sculptures are generally associated with special or extravagant events because of their limited lifetime." , "the activity of traveling or sliding downhill over snow on a sled." , "approaching, at, or below the freezing point. extremely or uncomfortably cold; chilled"};
        }
        else if (this.category.equals("School")) {
            this.words = new String[]{"Education","Knowledge","Teachers","Students","Future","Learning","Exploring","Thinking","Growing","Innovation","Creativity","Success"};
            this.definitions = new String[]{"the process of receiving or giving systematic instruction, especially at a school or university." , "facts, information, and skills acquired by a person through experience or education; the theoretical or practical understanding of a subject." , "A teacher, also called a schoolteacher or formally an educator, is a person who helps students to acquire knowledge, competence or virtue. Informally the role of teacher may be taken on by anyone" , "A student is primarily a person enrolled in a school or other educational institution and who is under learning with goals of acquiring knowledge, developing professions and achieving employment in a desired field." , "the time or a period of time following the moment of speaking or writing; time regarded as still to come." ,"the acquisition of knowledge or skills through experience, study, or by being taught." , "Exploration is the act of searching for the purpose of discovery of information or resources" , "the process of using one's mind to consider or reason about something." , "(of a living thing) undergoing natural development by increasing in size and changing physically." , "Innovation is the practical implementation of ideas that result in the introduction of new goods or services or improvement in offering goods or services." , "Creativity is a phenomenon whereby something new and valuable is formed. The created item may be intangible or a physical object. Scholarly interest in creativity is found in a number of disciplines" , "Success is the state or condition of meeting a defined range of expectations. It may be viewed as the opposite of failure. The criteria for success depend on context, and may be relative to a particular observer or belief system."};
        }
        else if (this.category.equals("School Supplies")) {
            this.words = new String[]{"Books","Pens","Calculators","Paper","Erasers","Rulers","Scissors","Crayons","Backpacks","Agendas","Glue Sticks","Pencils"};
            this.definitions = new String[]{"A book is a medium for recording information in the form of writing or images, typically composed of many pages bound together and protected by a cover. The technical term for this physical arrangement is codex." , "an instrument for writing or drawing with ink, typically consisting of a metal nib or ball, or a nylon tip, fitted into a metal or plastic holder." , "something used for making mathematical calculations, in particular a small electronic device with a keyboard and a visual display." , "material manufactured in thin sheets from the pulp of wood or other fibrous substances, used for writing, drawing, or printing on, or as wrapping material." , "an object, typically a piece of soft rubber or plastic, used to rub out something written." , "sometimes called a rule or line gauge, is a device used in geometry and technical drawing, as well as the engineering and construction industries, to measure distances or draw straight lines" , "an instrument used for cutting cloth, paper, and other thin material, consisting of two blades laid one on top of the other and fastened in the middle so as to allow them to be opened and closed by a thumb and finger inserted through rings on the end of their handles." , "a pencil or stick of colored chalk or wax, used for drawing." , "A backpack—also called knapsack, schoolbag, rucksack, rucksac, pack, sackpack, booksack, bookbag or backsack—is, in its simplest frameless form, a fabric sack carried on one's back and secured with two straps that go over the shoulders, but it can have an external frame, internal frame, and there are bodypacks." , "An agenda is a list of meeting activities in the order in which they are to be taken up, beginning with the call to order and ending with adjournment. It usually includes one or more specific items of business to be acted upon. It may, but is not required to, include specific times for one or more activities." , "Glue sticks are solid and hard adhesives in twist or push-up tubes. Users can apply glue by holding the open tube to keep their fingers clean and rubbing the exposed stick against a surface." , "A pencil is a writing or drawing implement with a solid pigment core encased in a sleeve, barrel, or shaft that prevents breaking the core or marking a user's hand."};
        }
        else if (this.category.equals("Kids")) {
            this.words = new String[]{"Playful","joy","happiness","Innocence","Purity","Beauty","Toys","Games","Young","Adventurous","Small","Energetic","Colourful","Fulfilling","Exciting","Exhausting"};
            this.definitions = new String[]{"fond of games and amusement; lighthearted" , "a feeling of great pleasure and happiness." , "The term happiness is used in the context of mental or emotional states, including positive or pleasant emotions ranging from contentment to intense joy. It is also used in the context of life satisfaction, subjective well-being, eudaimonia, flourishing and well-being." , "Innocence is a lack of guilt, with respect to any kind of crime, or wrongdoing. In a legal context, innocence is to the lack of legal guilt of an individual, with respect to a crime. In other contexts, it is a lack of experience." , "freedom from adulteration or contamination." , "Beauty is commonly described as a feature of objects that makes these objects pleasurable to perceive. Such objects include landscapes, sunsets, humans and works of art" , "A toy is an item that is used primarily by children though may also be marketed to adults under certain circumstances. Playing with toys can be an enjoyable means of training young children for life experiences. Different materials like wood, clay, paper, and plastic are used to make toy" , "a form of play or sport, especially a competitive one played according to rules and decided by skill, strength, or luck." , "having lived or existed for only a short time.", "willing to take risks or to try out new methods, ideas, or experiences." , "of a size that is less than normal or usual." , "An energetic person is very active and does not feel at all tired. An energetic activity involves a lot of physical movement and power." , "full of interest; lively and exciting." , "causing great enthusiasm and eagerness." , "making one feel very tired; very tiring."};
        }
        else if (this.category.equals("Holidays")) {
            this.words = new String[]{"Gathering","Family","Fun","Relaxing","Peaceful","Interesting","Wonderful","Enjoyable","Breathtaking","Generous","Forgiving","Hopeful","Holy","Break","Celebration","Pleasure","Cheerful","Amazing”,”Festive"};
            this.definitions = new String[]{"an assembly or meeting, especially a social or festive one or one held for a specific purpose." , "a group of one or more parents and their children living together as a unit." , "enjoyment, amusement, or lighthearted pleasure." , "reducing tension or anxiety." , "free from disturbance; tranquil." , "arousing curiosity or interest; holding or catching the attention." , "inspiring delight, pleasure, or admiration; extremely good; marvelous." , "(of an activity or occasion) giving delight or pleasure." , "astonishing or awe-inspiring in quality, so as to take one's breath away." , "(of a person) showing a readiness to give more of something, as money or time, than is strictly necessary or expected." , " deliberate decision to release feelings of resentment or vengeance toward a person or group who has harmed you, regardless of whether they actually deserve your forgiveness" , "feeling or inspiring optimism about a future event." ,"dedicated or consecrated to God or a religious purpose; sacred." , "a pause in work or during an activity or event." , "the action of marking one's pleasure at an important event or occasion by engaging in enjoyable, typically social, activity." , "a feeling of happy satisfaction and enjoyment." , "noticeably happy and optimistic." , "causing great surprise or wonder; astonishing." ,"cheerful and jovially celebratory."};
        }
        else {
            this.words = new String[]{};
            this.definitions = new String[]{};
        }
    }

    static String[] allCategories() {
        return new String[]{"Sports", "Transportation", "Summer", "Winter", "School", "School Supplies", "Holidays"};
    }

    public String definitionOf(String word) {
        for (int i = 0; i < this.words.length; i++) {
            if (this.words[i].toLowerCase().equals(word.toLowerCase())) {
                return this.definitions[i];
            }
        }
        return null;
    }

    public String[] autocorrectWords(String word) {
        Autocorrect autocorrect = new Autocorrect(this.words);
        return autocorrect.autocorrectWords(word);
    }

    public String[] getWords() {
        return words;
    }
}