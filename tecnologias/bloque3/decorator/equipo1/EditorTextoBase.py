from abc import ABC, abstractclassmethod

class EditorTextoBase(ABC):
    @abstractmethod
    def aplicar_formato(self):
        pass