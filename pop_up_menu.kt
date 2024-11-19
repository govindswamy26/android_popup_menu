import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.PopupMenu

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Find the button in the layout
        val showPopupButton: Button = findViewById(R.id.showPopupButton)

        // Set click listener for the button
        showPopupButton.setOnClickListener { view ->
            showPopupMenu(view)
        }
    }

    private fun showPopupMenu(view: View) {
        // Create a new PopupMenu
        val popupMenu = PopupMenu(this, view)
        
        // Inflate the menu from the XML resource
        popupMenu.menuInflater.inflate(R.menu.popup_menu, popupMenu.menu)

        // Set item click listener for the popup menu
        popupMenu.setOnMenuItemClickListener { item: MenuItem ->
            when (item.itemId) {
                R.id.option1 -> {
                    Toast.makeText(this, "Option 1 selected", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.option2 -> {
                    Toast.makeText(this, "Option 2 selected", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.option3 -> {
                    Toast.makeText(this, "Option 3 selected", Toast.LENGTH_SHORT).show()
                    true
                }
                else -> false
            }
        }

        // Show the popup menu
        popupMenu.show()
    }
}
