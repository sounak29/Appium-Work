@Imageviewer
Feature: Check Imageviewer

  Scenario: Verify Image Viewer button
    When user click on Views
    And user click Image Viewer
		Then user is on the 'Views/ImageView' page
		And user shoud see the images