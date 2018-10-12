package com.example.farras23.applistview;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final String[] nameArray = {"Alligator",
                "Dragon",
                "Gorila",
                "Lion",
                "Octopus",
                "Beaver",
                "Cat",
                "Corgi",
                "Derr",
                "Dolphin",
                "Elephant",
                "Falcon",
                "Fish",
                "Fox",
                "German Shepherd",
                "Giraffe",
                "Hornet",
                "Owl",
                "Rhinoceros",
                "Shark",
                "Sheep",
                "Swan",
                "Tiger",
                "Whale",
                "Wolf"};

        String[] infoArray = {
                "very dangerous animals",
                "Animals that are in legend",
                "largest primate",
                "King of the Jungle",
                "eight-limbed mollusc of the order Octopoda.",
                "is a large, primarily nocturnal, semiaquatic rodent.",
                "a carnivorous mammal from the Felidae family.",
                "a carnivorous mammal from the Felidae family.",
                "Is a ruminant mammal that belongs to the Cervidae family.",
                "Very intelligent marine mammals, besides that the natural system that complements the body is very complex.",
                "Elephants are large mammals from the family Elephantidae and the Proboscidea order. Traditionally, there are two recognized species, namely the African elephant (Loxodonta africana) and the Asian elephant (Elephas maximus)",
                "are birds of prey in the genus Falco, which includes about 40 species",
                "are gill-bearing aquatic craniate animals that lack limbs with digits.",
                "are small-to-medium-sized, omnivorous mammals belonging to several genera of the family Canidae.",
                "is a breed of medium to large-sized working dog that originated in Germany.",
                "is a genus of African even-toed ungulate mammals, the tallest living terrestrial animals and the largest ruminants.",
                "are the largest of the eusocial wasps, and are similar in appearance to their close relatives yellowjackets. Some species can reach up to 5.5 cm (2.2 in) in length",
                "are birds from the order Strigiformes, which includes about 200 species of mostly solitary and nocturnal birds of prey typified by an upright stance, a large, broad head, binocular vision, binaural hearing, sharp talons, and feathers adapted for silent flight",
                "as well as any of the numerous extinct species.",
                "are a group of elasmobranch fish characterized by a cartilaginous skeleton, five to seven gill slits on the sides of the head, and pectoral fins that are not fused to the head.",
                "are quadrupedal, ruminant mammals typically kept as livestock. Like most ruminants, sheep are members of the order Artiodactyla, the even-toed ungulates.",
                "are birds of the family Anatidae within the genus Cygnus.",
                "the largest cat species, most recognizable for its pattern of dark vertical stripes on reddish-orange fur with a lighter underside.",
                "are a widely distributed and diverse group of fully aquatic placental marine mammals.",
                "also known as the gray wolf, timber wolf,[4][5] western wolf,[b] and its other subspecies is a canine native to the wilderness and remote areas of Eurasia and North America."

        };

        Integer[] imageArray = {R.drawable.alligator,
                R.drawable.dragon,
                R.drawable.gorilla,
                R.drawable.lion,
                R.drawable.octopus,
                R.drawable.beaver,
                R.drawable.cat,
                R.drawable.corgi,
                R.drawable.deer,
                R.drawable.dolphin,
                R.drawable.elephant,
                R.drawable.falcon,
                R.drawable.fish,
                R.drawable.fox,
                R.drawable.germanshepherd,
                R.drawable.giraffe,
                R.drawable.hornet,
                R.drawable.owl,
                R.drawable.rhinoceros,
                R.drawable.shark,
                R.drawable.sheep,
                R.drawable.swan,
                R.drawable.tiger,
                R.drawable.whale,
                R.drawable.wolf

        };

        ListView listView;
        CustomListAdapter whatever = new CustomListAdapter(this, nameArray, infoArray, imageArray);
        listView = (ListView) findViewById(R.id.listviewID);
        listView.setAdapter(whatever);

        listView.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this, ActivityDetail.class);
                String message = nameArray[position];
                intent.putExtra("animal", message);
                startActivity(intent);
            }
        });
    }
}
