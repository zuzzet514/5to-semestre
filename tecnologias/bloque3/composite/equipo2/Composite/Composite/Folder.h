#ifndef FOLDER_H
#define FOLDER_H
#include <vector>
#include <memory>
#include <filesystem>
#include <string>
#include <iostream>>
#include "TextFile.h"
#include "ScriptFile.h"
#include "FileSystemComponent.h"


class Folder : public FileSystemComponent {
    private:
        std::string name;
        std::vector<std::shared_ptr<FileSystemComponent>> components;

        public:
            Folder(const std::string& name) : name(name) {}

            void add(const std::shared_ptr<FileSystemComponent>& component) {
                components.push_back(component);
            }

            void showDetails() const override;
            void findSensitiveData() const override;
            bool checkForSuspiciousActivity() const override;
            int getDepth() ;
            void autoClassfyFile 


};



#endif // FOLDER_H
