# BottomNavigation
 Demonstration of Using Bottom Navigation 
 
 Steps:
 -> create New Project with empty activity
 -> add Bottom Navigation View and HostFragment in Main Activity
 -> add menu items in menu/xyz.xml file
 -> add bottom navigation selected item menu change listener to the bottom navigation i.e as given belwo:
 bottomNavigation.setOnNavigationItemReselectedListener {
            when (it.itemId) {
                R.id.navigation_dashboard -> {
                    toolbar.title = "Dashboard"
                    openFragment(dashboard)
                    return@setOnNavigationItemReselectedListener
                }
                R.id.navigation_home -> {
                    toolbar.title = "Home"
                    openFragment(home)
                    return@setOnNavigationItemReselectedListener
                }
                R.id.navigation_notifications -> {
                    return@setOnNavigationItemReselectedListener

                }
                R.id.navigation_notifications2 -> {
                    return@setOnNavigationItemReselectedListener

                }
                else -> return@setOnNavigationItemReselectedListener
            }
        }
