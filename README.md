# CatApiBreeds
------------------
Octo Tech: Create an API request call app

### My Plan of Action:
- Call the BASE_URL which has the lists of Breeds from the api
- Select only the id, name and reference_image_id from the apiModel.
- Use the id to list all the breeds on the 1st page for the user to show the breeds available as a button.
- Use the ‘name’ to display each breed names on the button
- When button is clicked, use the reference_image_id to display all the list of the selected breed type. the url will have to be somewhat hardcoded to gain image - some maybe gifs…
- Allow a floating button to let the user go back to 1st page.

### Steps to take:
0.1 - get all dependencies ready

0.2 - create Class file next to MainActivity to use @HiltAndroidApp to call Hilt Dagger quicker in the Application().
  Pass the Application in the AndroidManifests file so it's connected.

1 - create the models with @serialize

2 - create OKHttpClient in ApiModule and locate BASE_URLs
  Implement Singleton component and Module

3 - create ViewModel
3.1 - create repository
	making api without making a network request
3.2 - create ViewDataMapper from DTO (Model) to ViewData

4 - Create handling cases:
4.1 - create Viewdata	for error handling 
4.2 - create error handling and loading in Model

5 - create compose UI
5.1 - create NavHost/controller in Navigation and call it from the MainActivity.
	- one for Home Screen
	- one for loaded images screen

6 - connect ViewModel with Compose UI
