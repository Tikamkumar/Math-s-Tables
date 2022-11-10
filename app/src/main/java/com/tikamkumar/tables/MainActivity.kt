package com.tikamkumar.tables

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import android.net.Uri
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.TextView
import androidx.appcompat.app.ActionBarDrawerToggle
import com.google.android.material.navigation.NavigationView
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import androidx.drawerlayout.widget.DrawerLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.res.ResourcesCompat
import androidx.core.view.GravityCompat
import com.tikamkumar.Developer
import com.tikamkumar.tables.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(),NavigationView.OnNavigationItemSelectedListener {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        navigationDrawer()

        val drawerLayout: DrawerLayout = binding.drawerLayout
        val navView: NavigationView = binding.navView
        val navController = findNavController(R.id.nav_host_fragment_content_main)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.home, R.id.developer, R.id.exit,R.id.send,R.id.moreApps
            ), drawerLayout
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)
        navView.setNavigationItemSelectedListener(this)

        binding.one.setOnClickListener {
            table(1)
            tableNumber(getString(R.string.one))
        }

        binding.two.setOnClickListener {
            table(2)
            tableNumber("Table For 2")
        }

        binding.three.setOnClickListener {
            table(3)
            tableNumber("Table For 3")
        }

        binding.four.setOnClickListener {
            table(4)
            tableNumber("Table For 4")
        }

        binding.five.setOnClickListener {
            table(5)
            tableNumber("Table For 5")
        }

        binding.six.setOnClickListener {
            table(6)
            tableNumber("Table For 6")
        }

        binding.seven.setOnClickListener {
            table(7)
            tableNumber("Table For 7")
        }

        binding.eight.setOnClickListener {
            table(8)
            tableNumber("Table For 8")
        }

        binding.nine.setOnClickListener {
            table(9)
            tableNumber("Table For 9")
        }

        binding.ten.setOnClickListener {
            table(10)
            tableNumber("Table For 10")
        }

        binding.eleven.setOnClickListener {
            table(11)
            tableNumber("Table For 11")
        }

        binding.twelve.setOnClickListener {
            table(12)
            tableNumber("Table For 12")
        }

        binding.thirteen.setOnClickListener {
            table(13)
            tableNumber("Table For 13")
        }

        binding.fouteen.setOnClickListener {
            table(14)
            tableNumber("Table For 14")
        }

        binding.fifteen.setOnClickListener {
            table(15)
            tableNumber("Table For 15")
        }

        binding.sixteen.setOnClickListener {
            table(16)
            tableNumber("Table For 16")
        }

        binding.seventeen.setOnClickListener {
            table(17)
            tableNumber("Table For 17")
        }

        binding.eighteen.setOnClickListener {
            table(18)
            tableNumber("Table For 18")
        }

        binding.nineteen.setOnClickListener {
            table(19)
            tableNumber("Table For 19")
        }

        binding.twenty.setOnClickListener {
            table(20)
            tableNumber("Table For 20")
        }

        binding.twentyOne.setOnClickListener {
            table(21)
            tableNumber("Table For 21")
        }

        binding.twentyTwo.setOnClickListener {
            table(22)
            tableNumber("Table For 22")
        }

        binding.twentyThree.setOnClickListener {
            table(23)
            tableNumber("Table For 23")
        }

        binding.twentyFour.setOnClickListener {
            table(24)
            tableNumber("Table For 24")
        }

        binding.twentyFive.setOnClickListener {
            table(25)
            tableNumber("Table For 25")
        }

        binding.twentySix.setOnClickListener {
            table(26)
            tableNumber("Table For 26")
        }

        binding.twentySeven.setOnClickListener {
            table(27)
            tableNumber("Table For 27")
        }

        binding.twentyEight.setOnClickListener {
            table(28)
            tableNumber("Table For 28")
        }

        binding.twentyNine.setOnClickListener {
            table(29)
            tableNumber("Table For 29")
        }

        binding.thirty.setOnClickListener {
            table(30)
            tableNumber("Table For 30")
        }

        binding.thirtyOne.setOnClickListener {
            table(31)
            tableNumber("Table For 31")
        }

        binding.thirtyTwo.setOnClickListener {
            table(32)
            tableNumber("Table For 32")
        }

        binding.thirtyThree.setOnClickListener {
            table(33)
            tableNumber("Table For 33")
        }

        binding.thirtyFour.setOnClickListener {
            table(34)
            tableNumber("Table For 34")
        }

        binding.thirtyFive.setOnClickListener {
            table(35)
            tableNumber("Table For 35")
        }

        binding.thirtySix.setOnClickListener {
            table(36)
            tableNumber("Table For 36")
        }

        binding.thirtySeven.setOnClickListener {
            table(37)
            tableNumber("Table For 37")
        }

        binding.thirtyEight.setOnClickListener {
            table(38)
            tableNumber("Table For 38")
        }

        binding.thirtyNine.setOnClickListener {
            table(39)
            tableNumber("Table For 39")
        }

        binding.forty.setOnClickListener {
            table(40)
            tableNumber("Table For 40")
        }

        binding.fortyOne.setOnClickListener {
            table(41)
            tableNumber("Table For 41")
        }

        binding.fortyTwo.setOnClickListener {
            table(42)
            tableNumber("Table For 42")
        }

        binding.fortyThree.setOnClickListener {
            table(43)
            tableNumber("Table For 43")
        }

        binding.fortyFour.setOnClickListener {
            table(44)
            tableNumber("Table For 44")
        }

        binding.fortyFive.setOnClickListener {
            table(45)
            tableNumber("Table For 45")
        }

        binding.fortySix.setOnClickListener {
            table(46)
            tableNumber("Table For 46")
        }

        binding.fortySeven.setOnClickListener {
            table(47)
            tableNumber("Table For 47")
        }

        binding.fortyEight.setOnClickListener {
            table(48)
            tableNumber("Table For 48")
        }

        binding.fortyNine.setOnClickListener {
            table(49)
            tableNumber("Table For 49")
        }

        binding.fifty.setOnClickListener {
            table(50)
            tableNumber("Table For 50")
        }

        binding.fiftyOne.setOnClickListener {
            table(51)
            tableNumber("Table For 51")
        }

        binding.fiftyTwo.setOnClickListener {
            table(52)
            tableNumber("Table For 52")
        }

        binding.fiftyThree.setOnClickListener {
            table(53)
            tableNumber("Table For 53")
        }

        binding.fiftyFour.setOnClickListener {
            table(54)
            tableNumber("Table For 54")
        }

        binding.fiftyFive.setOnClickListener {
            table(55)
            tableNumber("Table For 55")
        }

        binding.fiftySix.setOnClickListener {
            table(56)
            tableNumber("Table For 56")
        }

        binding.fiftySeven.setOnClickListener {
            table(57)
            tableNumber("Table For 57")
        }

        binding.fiftyEight.setOnClickListener {
            table(58)
            tableNumber("Table For 58")
        }

        binding.fiftyNine.setOnClickListener {
            table(59)
            tableNumber("Table For 59")
        }

        binding.sixty.setOnClickListener {
            table(60)
            tableNumber("Table For 60")
        }

        binding.sixtyOne.setOnClickListener {
            table(61)
            tableNumber("Table For 61")
        }

        binding.sixtyTwo.setOnClickListener {
            table(62)
            tableNumber("Table For 62")
        }

        binding.sixtyThree.setOnClickListener {
            table(63)
            tableNumber("Table For 63")
        }

        binding.sixtyFour.setOnClickListener {
            table(64)
            tableNumber("Table For 64")
        }

        binding.sixtyFive.setOnClickListener {
            table(65)
            tableNumber("Table For 65")
        }

        binding.sixtySix.setOnClickListener {
            table(66)
            tableNumber("Table For 66")
        }

        binding.sixtySeven.setOnClickListener {
            table(67)
            tableNumber("Table For 67")
        }

        binding.sixtyEight.setOnClickListener {
            table(68)
            tableNumber("Table For 68")
        }

        binding.sixtyNine.setOnClickListener {
            table(69)
            tableNumber("Table For 69")
        }

        binding.seventy.setOnClickListener {
            table(70)
            tableNumber("Table For 70")
        }

        binding.seventyOne.setOnClickListener {
            table(71)
            tableNumber("Table For 71")
        }

        binding.seventyTwo.setOnClickListener {
            table(72)
            tableNumber("Table For 72")
        }

        binding.seventyThree.setOnClickListener {
            table(73)
            tableNumber("Table For 73")
        }

        binding.seventyFour.setOnClickListener {
            table(74)
            tableNumber("Table For 74")
        }

        binding.seventyFive.setOnClickListener {
            table(75)
            tableNumber("Table For 75")
        }

        binding.seventySix.setOnClickListener {
            table(76)
            tableNumber("Table For 76")
        }

        binding.seventySeven.setOnClickListener {
            table(77)
            tableNumber("Table For 77")
        }

        binding.seventyEight.setOnClickListener {
            table(78)
            tableNumber("Table For 78")
        }

        binding.seventyNine.setOnClickListener {
            table(79)
            tableNumber("Table For 79")
        }

        binding.eighty.setOnClickListener {
            table(80)
            tableNumber("Table For 80")
        }

        binding.eightyOne.setOnClickListener {
            table(81)
            tableNumber("Table For 81")
        }

        binding.eightyTwo.setOnClickListener {
            table(82)
            tableNumber("Table For 82")
        }

        binding.eightyThree.setOnClickListener {
            table(83)
            tableNumber("Table For 83")
        }

        binding.eightyFour.setOnClickListener {
            table(84)
            tableNumber("Table For 84")
        }

        binding.eightyFive.setOnClickListener {
            table(85)
            tableNumber("Table For 85")
        }

        binding.eightySix.setOnClickListener {
            table(86)
            tableNumber("Table For 86")
        }

        binding.eightySeven.setOnClickListener {
            table(87)
            tableNumber("Table For 87")
        }

        binding.eightyEight.setOnClickListener {
            table(88)
            tableNumber("Table For 88")
        }

        binding.eightyNine.setOnClickListener {
            table(89)
            tableNumber("Table For 89")
        }

        binding.ninty.setOnClickListener {
            table(90)
            tableNumber("Table For 90")
        }

        binding.nintyOne.setOnClickListener {
            table(91)
            tableNumber("Table For 91")
        }

        binding.nintyTwo.setOnClickListener {
            table(92)
            tableNumber("Table For 92")
        }

        binding.nintyThree.setOnClickListener {
            table(93)
            tableNumber("Table For 93")
        }

        binding.nintyFour.setOnClickListener {
            table(94)
            tableNumber("Table For 94")
        }

        binding.nintyFive.setOnClickListener {
            table(95)
            tableNumber("Table For 95")
        }

        binding.nintySix.setOnClickListener {
            table(96)
            tableNumber("Table For 96")
        }

        binding.nintySeven.setOnClickListener {
            table(97)
            tableNumber("Table For 97")
        }

        binding.nintyEight.setOnClickListener {
            table(98)
            tableNumber("Table For 98")
        }

        binding.nintyNine.setOnClickListener {
            table(99)
            tableNumber("Table For 99")
        }

        binding.hundred.setOnClickListener {
            table(100)
            tableNumber("Table For 100")
        }

        binding.allclear.setOnClickListener {
            binding.showTable.text = ""
            binding.tablenum.text = ""
            }
    }

    private fun tableNumber(heading: String) {
      binding.tablenum.text = heading
    }

    private fun navigationDrawer() {
        val drawer : DrawerLayout = findViewById(R.id.drawer_layout)
        setSupportActionBar(binding.toolbar)
        val toggle = ActionBarDrawerToggle(this,drawer,binding.toolbar,
            R.string.Open,
            R.string.Close
        )
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        toggle.isDrawerIndicatorEnabled = true
        drawer.addDrawerListener(toggle)
        toggle.drawerArrowDrawable.color = ResourcesCompat.getColor(resources, R.color.white,null)
        toggle.syncState()
    }

    @SuppressLint("SetTextI18n")
    private fun table(num : Int){
        val show : TextView = findViewById(R.id.showTable)
        show.text = "$num x 1 = ${num*1}\n${num} x 2 = ${num*2}\n${num} x 3 = ${num*3}\n" +
                "$num x 4 = ${num*4}\n${num} x 5 = ${num*5}\n" +
                "$num x 6 = ${num*6}\n${num} x 7 = ${num*7}\n" +
                "$num x 8 = ${num*8}\n${num} x 9 = ${num*9}\n" +
                "$num x 10 = ${num*10}\n"
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.main, menu)
        return true
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment_content_main)
        return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when(item.itemId) {
            R.id.exit ->{
                finish()
            }
            R.id.developer -> {
                val intent = Intent(this@MainActivity, Developer::class.java)
                startActivity(intent)
                finish()
            }
            R.id.send -> {
                val intent = Intent()
                val data  = "This is Math's Tables App:-\n https://play.google.com/store/apps/details?id=com.tikamkumar.tables&hl=en"
                intent.action = Intent.ACTION_SEND
                intent.putExtra(Intent.EXTRA_TEXT,data)
                intent.type = "text/plain"
                startActivity(intent)
            }
            R.id.moreApps -> {
                val intent = Intent()
                val data  = "https://play.google.com/store/apps/developer?id=TIKAM+KUMAR&hl=en"
                intent.action = Intent.ACTION_VIEW
                intent.addCategory(Intent.CATEGORY_BROWSABLE)
                intent.data = Uri.parse(data)
                startActivity(intent)
            }
        }
        val drawerLayout: DrawerLayout = binding.drawerLayout
        drawerLayout.closeDrawer(GravityCompat.START)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.white -> {
                binding.showTable.setTextColor(Color.parseColor("#FF000000"))
                binding.blackBoard.setBackgroundColor(Color.parseColor("#FFFFFFFF"))
            }
            R.id.black -> {
                binding.showTable.setTextColor(Color.parseColor("#FFFFFFFF"))
                binding.blackBoard.setBackgroundColor(Color.parseColor("#FF000000"))
            }
        }
        return super.onOptionsItemSelected(item)
    }

    override fun onBackPressed() {
        val drawer : DrawerLayout = findViewById(R.id.drawer_layout)
        if(drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START)
        }
        else {
            super.onBackPressed()
        }
    }
}