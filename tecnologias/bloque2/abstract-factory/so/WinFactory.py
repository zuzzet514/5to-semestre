from GUIFactory import *
from MenuBar import *
from Session import *
from Driver import *

class WinFactory(GUIFactory):
    def create_MenuBar(self):
        return MacMenuBar()
    def create_session(self):
        return WinSessionSession()
    def create_drivers(self):
        return [WinAudioDriver(), WinAudioDriver()]