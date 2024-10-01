from WinFactory import *
from MacFactory import *

def create_gui(factory, usuario,task_name):
    MenuBar = factory.create_menuBar()
    Session = factory.create_session()
    Driver = factory.create_driver()

    