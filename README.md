# CatApiBreeds
------------------
Octo Tech: Create an API request call app

### My Plan of Action:
- Call the BASE_URL which has the lists of Breeds from the api
- Select only the id, name and reference_image_id from the apiModel.
- Use the id to list all the breeds on the 1st page for the user to show the breeds available as a button.
- Use the ‘name’ to display each breed names on the button
- When button is clicked, use the reference_image_id to display all the list of the selected breed type. the url will have to be somewhat hardcoded to gain image - some maybe gif images.
- Allow a floating button to let the user go back to 1st page.

### Steps to take:
0.1 - get all dependencies ready

0.2 - create Class file next to MainActivity to use @HiltAndroidApp to call Hilt Dagger quicker in the Application().
  Pass the Application in the AndroidManifests file so it's connected.

1 - create the models with @serialize

2 - create OKHttpClient in ApiModule and locate BASE_URLs
  Implement Singleton component and Module

3 - create repository
	making api without making a network request

4 - Create handling cases:
4.1 - create Viewdata for error handling 
4.2 - create error handling and loading in Model

5 - create NavHost/controller in Navigation and call it from the MainActivity.
	- one for Home Screen
	- one for loaded images screen
5.1 - Create screens
 	- one for Home Screen
	- one for loaded images screen

6 - create ViewDataMapper from DTO (Model) to ViewData
6.2 - create compose UIs on Screens
6.3 - create ViewModel
6.4 - connect ViewModel with Compose UI


------
## Challenges Faced:
- Dependency injections were not compiling and has taken most of the time debugging. 
>`* What went wrong: Execution failed for task ':app:kaptDebugKotlin'.
> A failure occurred while executing org.jetbrains.kotlin.gradle.internal.KaptWithoutKotlincTask$KaptExecutionWorkAction'`
- Issue fixed with adding into build.gradle file: 
> `javacOptions { option("-Adagger.hilt.android.internal.disableAndroidSuperclassValidation=true") }`
- issue was related to support for Kotlin's plugin 1.5.20 and as it explains this is the bug of Kotlin's plugin, not dagger hilt's.
- Planning the best way to efficiently use the api calls to make the code less complicating.
	I came up with the solution was to use the main api call to gain breeds of cats, take their id String, use the id String to select the specific cat breed. From the selected cat breed lists api, retrieve the image url and display the images given back from the request sent.
- Creating a new project from scratch is harder than following the process of a created project.
- Implement error handles.
- Creating an onClick and make it link via filtering only the image.
- Faced a lot of walls creating the app. Have definitely learned to plan more simply for next time: to let the api calls happen first then build on the rest of the app like cashing, error handling, thinking about the next page already. 
- Making apps in between shifts allowed me to be more organised during the week to accommodate time for project making more intensely.
- 