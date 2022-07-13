package code.with.cal.cardviewrecyclerviewtutorial

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import code.with.cal.cardviewrecyclerviewtutorial.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), BookClickListener
{
    private lateinit var binding: ActivityMainBinding
    //private lateinit var category: String

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        populateItems()

        binding.recyclerView.apply {
            layoutManager = GridLayoutManager(applicationContext, 2)
            adapter = CardAdapter(itemList)
        }

//        binding.all.setOnClickListener{
//            category = "all"
//            findViewById<Button>(R.id.all).setBackgroundColor(
//                ContextCompat.getColor(applicationContext,
//                R.color.chosen_color))
//        }
//
//        binding.party.setOnClickListener{
//            category = "party"
//            findViewById<Button>(R.id.party).setBackgroundColor(
//                ContextCompat.getColor(applicationContext,
//                    R.color.chosen_color))
//        }
    }
    override fun onClick(item: Item)
    {
        val intent = Intent(applicationContext, DetailActivity::class.java)
        startActivity(intent)
    }

    private fun populateItems() {
        val item1 = Item(
            R.drawable.first,
            "Belt suit blazer",
            "$120",
            "Category1"
        )
        itemList.add(item1)

        val item2 = Item(
            R.drawable.second,
            "Belt suit blazer",
            "$120",
            "Category2"
        )
        itemList.add(item2)

        val item3 = Item(
            R.drawable.third,
            "Belt suit blazer",
            "$120",
            "Category3"
        )
        itemList.add(item3)

        val item4 = Item(
            R.drawable.fourth,
            "Belt suit blazer",
            "$120",
            "Camping"
        )
        itemList.add(item4)

    }


}