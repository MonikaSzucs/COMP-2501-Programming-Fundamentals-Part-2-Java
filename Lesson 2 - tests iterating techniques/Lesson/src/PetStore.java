import java.util.ArrayList;
import java.util.List;

class PetStore
{
    private String[] animalTypes;
    private List<String> typesOfPets;

    PetStore()
    {
        animalTypes = new String[20];           // animalTypes.length == 20
        typesOfPets = new ArrayList<String>();  // typesOfPets.size() == 0
        System.out.println(typesOfPets.size());

        for(String pet: animalTypes)
        {
            System.out.println(pet);
        }
    }
}
