# Prabhnoor Kaur
# Lab #12

def area_rectangle(base, height):
    return base * height

def area_circle(radius):
    pi = 3.14159
    return pi * radius * radius


base = float(input("Enter the base of the rectangle: "))
height = float(input("Enter the height of the rectangle: "))
rectangle_area = area_rectangle(base, height)

print(f"The area of the rectangle with base {base} and height {height} is {rectangle_area:.2f}")

radius = float(input("Enter the radius of the circle: "))

circle_area = area_circle(radius)

print(f"The area of the circle with radius {radius} is {circle_area:.2f}")

