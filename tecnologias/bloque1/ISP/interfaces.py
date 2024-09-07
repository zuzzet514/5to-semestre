from abc import ABC, abstractclassmethod
#interfaces

class ImageScaler(ABC):
    @staticmethod
    @abstractsmethod
    def scale(dimensions_to_scale, image):
        raise NotImplementedError()
    
    @staticmethod
    @abstractmethod
    def scale_without_deforming(dimensions_to_scale, image):
        raise NotImplementedError
    
    class ImageFetcher(ABC):
        @staticmethod
        @abstractmethod
        def get_random_images(render_of_images, path)
            raise NotImplementedError
        
    class ImagePoster(ABC):
        @abstractmethod
        def post_image(self, img_path_text):
            raise NotImplementedError    