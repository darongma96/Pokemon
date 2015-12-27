
public class Effectiveness {
	public static double calculateEffectiveness(String attack, String defend) {
		switch (attack) {
		case "Normal":
			switch (defend) {
			case "Rock":
				return .5;
			case "Ghost":
				return 0;
			case "Steel":
				return .5;
			default:
				return 1;
			}
		case "Fighting":
			switch (defend) {
			case "Normal":
				return 2;
			case "Flying":
				return .5;
			case "Poison":
				return .5;
			case "Rock":
				return 2;
			case "Bug":
				return .5;
			case "Ghost":
				return 0;
			case "Steel":
				return 2;
			case "Psychic":
				return .5;
			case "Ice":
				return 2;
			case "Dark":
				return 2;
			case "Fairy":
				return .5;
			default:
				return 1;
			}
		case "Flying":
			switch (defend) {
			case "Fighting":
				return 2;
			case "Rock":
				return .5;
			case "Bug":
				return 2;
			case "Steel":
				return .5;
			case "Grass":
				return 2;
			case "Electric":
				return .5;
			default:
				return 1;
			}
		case "Poison":
			switch (defend) {
			case "Poison":
				return .5;
			case "Ground":
				return .5;
			case "Rock":
				return .5;
			case "Ghost":
				return .5;
			case "Steel":
				return 0;
			case "Grass":
				return 2;
			case "Fairy":
				return 2;
			default:
				return 1;
			}
		case "Ground":
			switch (defend) {
			case "Flying":
				return 0;
			case "Poison":
				return 2;
			case "Rock":
				return 2;
			case "Bug":
				return .5;
			case "Steel":
				return 2;
			case "Fire":
				return 2;
			case "Grass":
				return .5;
			case "Electric":
				return 2;
			default:
				return 1;
			}
		case "Rock":
			switch (defend) {
			case "Fighting":
				return .5;
			case "Flying":
				return 2;
			case "Ground":
				return .5;
			case "Bug":
				return 2;
			case "Steel":
				return .5;
			case "Fire":
				return 2;
			case "Ice":
				return 2;
			default:
				return 1;
			}
		case "Bug":
			switch (defend) {
			case "Fighting":
				return .5;
			case "Flying":
				return .5;
			case "Poison":
				return .5;
			case "Ghost":
				return .5;
			case "Steel":
				return .5;
			case "Fire":
				return .5;
			case "Grass":
				return 2;
			case "Psychic":
				return 2;
			case "Dark":
				return 2;
			case "Fairy":
				return .5;
			default:
				return 1;
			}
		case "Ghost":
			switch (defend) {
			case "Normal":
				return 0;
			case "Ghost":
				return 2;
			case "Psychic":
				return 2;
			case "Dark":
				return .5;
			default:
				return 1;
			}
		case "Steel":
			switch (defend) {
			case "Rock":
				return 2;
			case "Steel":
				return .5;
			case "Fire":
				return .5;
			case "Water":
				return .5;
			case "Electric":
				return .5;
			case "Ice":
				return 2;
			case "Fairy":
				return 2;
			default:
				return 1;
			}
		case "Fire":
			switch (defend) {
			case "Rock":
				return .5;
			case "Bug":
				return 2;
			case "Steel":
				return 2;
			case "Fire":
				return .5;
			case "Water":
				return .5;
			case "Grass":
				return 2;
			case "Ice":
				return 2;
			case "Dragon":
				return .5;
			default:
				return 1;
			}
		case "Water":
			switch (defend) {
			case "Ground":
				return 2;
			case "Rock":
				return 2;
			case "Fire":
				return 2;
			case "Water":
				return .5;
			case "Grass":
				return .5;
			case "Dragon":
				return .5;
			default:
				return 1;
			}
		case "Grass":
			switch (defend) {
			case "Flying":
				return .5;
			case "Poison":
				return .5;
			case "Ground":
				return 2;
			case "Rock":
				return 2;
			case "Bug":
				return .5;
			case "Steel":
				return .5;
			case "Fire":
				return .5;
			case "Water":
				return 2;
			case "Grass":
				return .5;
			case "Dragon":
				return .5;
			default:
				return 1;
			}
		case "Electric":
			switch (defend) {
			case "Flying":
				return 2;
			case "Ground":
				return 0;
			case "Water":
				return 2;
			case "Grass":
				return .5;
			case "Electric":
				return .5;
			case "Dragon":
				return .5;
			default:
				return 1;
			}
		case "Psychic":
			switch (defend) {
			case "Fighting":
				return 2;
			case "Poison":
				return 2;
			case "Steel":
				return .5;
			case "Psychic":
				return .5;
			case "Dark":
				return 0;
			default:
				return 1;
			}
		case "Ice":
			switch (defend) {
			case "Flying":
				return 2;
			case "Ground":
				return 2;
			case "Steel":
				return .5;
			case "Fire":
				return .5;
			case "Water":
				return .5;
			case "Grass":
				return 2;
			case "Ice":
				return .5;
			case "Dragon":
				return 2;
			default:
				return 1;
			}
		case "Dragon":
			switch (defend) {
			case "Steel":
				return .5;
			case "Dragon":
				return 2;
			case "Fairy":
				return 0;
			default:
				return 1;
			}
		case "Dark":
			switch (defend) {
			case "Fighting":
				return .5;
			case "Ghost":
				return 2;
			case "Psychic":
				return 2;
			case "Dark":
				return .5;
			case "Fairy":
				return .5;
			default:
				return 1;
			}
		case "Fairy":
			switch (defend) {
			case "Fighting":
				return 2;
			case "Poison":
				return .5;
			case "Steel":
				return .5;
			case "Fire":
				return .5;
			case "Dragon":
				return 2;
			case "Dark":
				return 2;
			default:
				return 1;
			}
		default:
			return 1;
		}
	}
	
	public static String[] types(String type1, String type2) {
		String[] types = {"Normal", "Fighting", "Flying", "Poison", "Ground", "Rock", "Bug", "Ghost", "Steel", "Fire", "Water", "Grass", "Electric", "Psychic", "Ice", "Dragon", "Dark", "Fairy"};
		String normal = "";
		String weak = "";
		String immune = "";
		String resistant = "";
        
		double total;
		int count = 0;
        
        for (int i = 0; i < types.length; i++) {
        	total = Math.round(Effectiveness.calculateEffectiveness(types[i], type1) * 100.0) / 100.0 * (!type2.equals("N/A") ? 
        			Math.round(Effectiveness.calculateEffectiveness(types[i], type2) * 100.0) / 100.0 : 1);
        	if (total == 1) {
        		if (++count != 5) {
        			normal += types[i] + "    ";
        		} else {
        			normal += types[i] + "\n";
        			count = 0;
        		}
        	} else if (total >= 2) {
        		weak += types[i] + " " + (total != 2 ? total : "") + " ";
        	} else if (total == 0) {
        		immune += types[i] + "    ";
        	} else if (total  < 1) {
        		resistant += types[i] + " " + (total != 0.5 ? total : "") + " ";
        	} 
        }
        String[] mult = {normal, weak, resistant, immune};
        return mult;
	}
}
