## Control Jarvis using Android App

A native Android app for Jarvis is currently under development.

Meanwhile you can enjoy this:

### Pre-requisites

* Jarvis Plugins
  * Jarvis-API (free) to control Jarvis with HTTP requests
* On your Android device
  * A launcher that detects "Ok Google", ex: Google Now Launcher (free)
  * Tasker (2,99 €) to send HTTP requests to Jarvis from your Android device
  * AutoVoice (free) to intercept your Google Now queries and forward them to Tasker
Make sure the accessibility service is enabled for AutoVoice:

* Open the phone settings menu
* Go to the "Accessibility" menu
* Go to "AutoVoice" Google Now Integration
* Allow Google Now to intercept with the button at the top of the menu

### Creating the Profile to Intercept Google Now Commands

Open Tasker, and perform the following steps in the "Profiles" tab

* Click on the " +  " icon  at the bottom of the screen
* Choose Event
* In the Plugin category , choose AutoVoice  and then Recognized
* Press the edit button to the right of Configuration
* Press Command Filter to indicate a word that must be present in queries to intercept, eg  jarvis
* Close this configuration menu with the button check  up
* Go back to the main menu ( back button  at the top left of the screen)

### Creating the task to send them to Jarvis

At this point Tasker should open a menu inviting you to create a task for this event:

* Select New Task
* Name it for example Execute
* Press the + icon to add an action
* You can use the search to select Get HTTP
* Conduct the action as follows:

	* Server: Port: <jarvis url>: <port of jarvis-api>  (ex: 192.168.1.1:8080, displayed at the start of Jarvis)
	* Attributes: order =% Avcomm  (% Avcomm is the variable containing the voice command cleared)
* Go back to the task ( back button  at the top left of the screen)
* Go back to the main menu ( back button  at the top left of the screen)
* Exit Tasker, making sure to save the changes.

### use
From your home screen (screen on), say "Ok Google" and then an order containing the keyword indicated in Command Filter: 
" Ok Google ... Jarvis turns on the bar "


