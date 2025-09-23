from selenium import webdriver
from selenium.webdriver.common.by import By

with webdriver.Firefox() as driver:
    driver.get("https://training-support.net/webelements/dynamic-controls")    
    print("Title of page is ", driver.title)
# Find the text field.
# Check if the text field is enabled and print it.
# Click the "Enable Input" button to enable the input field.
# Check if the text field is enabled again and print it.

    inputfield = driver.find_element(By.ID, "textInput")
    print("input text box is enabled : ", inputfield.is_enabled())

    driver.find_element(By.ID, "textInputButton").click()

    inputfield = driver.find_element(By.ID, "textInput")
    print("input text box is enabled : ", inputfield.is_enabled())



