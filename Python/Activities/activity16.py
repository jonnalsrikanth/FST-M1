class car():
    def __init__(self, manufacturer, model):
        self.manufacturer = manufacturer
        self.model = model
    def accelerate(self):
        print(f"{self.manufacturer} {self.model} is moving")
    def stop(self):
        print(f"{self.manufacturer} {self.model} has stopped")


obj=car("Tata","nexon")
obj.accelerate()
obj1=car("Maruti", "Baleno")
obj1.accelerate()
obj2=car("Maruti", "800")
obj2.stop()
