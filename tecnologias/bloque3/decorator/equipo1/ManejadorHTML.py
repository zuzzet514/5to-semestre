import tkinter as tk
from tkinter import  filedialog,messagebox
from html.parser import HTMLParser

class ManejadorHTML:
    def __init__(self,text_area):
        self.text_area = text_area

    def guardar_como_html(self):
        file_path = filedialog.asksaveasfile(defaultextension=".html",
                                             filetypes=[("Archivos HTML",".html"), ("Todos los archivos", "*.*")])

        if file_path:
            try:
                contenido_html = self.convertir_a_html()
                with open(file_path, 'w',encoding='uft-8') as file:
                    file.write(contenido_html)
            except Exception as e:
                messagebox.showerror("Error",f"No se pudo guardar el archivo {e}")
    
    def convertir_a_html(self):
        contenido = self.text_area.get(1.0, tk.END)
        tags = self.text_area.tag_ranges(tk.SEL)

        html = "<html><body>"
        start = "1.0"
        for tag in tags:
            end = tag
            fragment = self.text_area.get(start, end)

            if "negrita" in self.text_area.tag_name(start):
                fragment = f"<b>{fragment}</b>"
            if "cursiva" in self.text_area.tag_name(start):
                fragment = f"<i>{fragment}</i>"
            if "subrayado" in self.text_area.tag_name(start):
                fragment = f"<u>{fragment}</u>"
            if tamaño:
                fragment = f"<span style= 'font-size: {tamaño}px' >{fragment}</span>"
            
            html += "</body></html>"
            return html
        
    def obtener_tamaño_fuente(self,index):
        for tag in self.text_area.tag_names(index):
            if tag.startswitch("tamaño_"):
                return tag.split("_")[1]
        return None
    
    def abrir_archivo(self):
        file_path = filedialog.askopenfile(defaultextension=".html", 
                                           filetypes=[{"Archivos HTML", "*.html"},{"Todos los archivos","*.*"}])
        if file_path:
            try:
                with open(file_path, 'r',encoding='utf-8') as file:
                    contenido_html = file.read()
                    self.cargar_desde_html(contenido_html)
            except Exception as e:


    def cargar_desde_html(self,html):
        self.text_area.delete(1.0,tk.END)

        class MyHTMLParser(HTMLParser):
            def __init__() :
                super().__init__()
