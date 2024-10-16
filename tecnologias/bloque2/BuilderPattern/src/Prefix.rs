use create::Componentes::User;
use std::fs::File;
use std::io::prelude::*;

pub struct PrefixSystem{
    users: Vec<User>,
    keyboard_alyout: String,
    hostname: String,
    language: String,
    swap: bool,
    optional_repositories: Vec<String>
}

impl PrefixSystem{
    fn from(users: Vec<User>,
        keyboard_alyout: String,
        hostname: String,
        language: String,
        swap: bool,
        optional_repositories: Vec<String>) -> Self {
            return Self{
                users: users,
                keyboard_alyout: String,
                hostname: String,
                language: String,
                swap: bool,
                optional_repositories: optional_repositories
            };
    }

    pub fn save_prefix(&self, filename: &str &) -> std::io::Result<()>{
        Ok(())
    }

    impl std::fmt::Display for PrefixSystem {
        fn fmt::Display for PrefixSystem{
            fn fmt(&self, f: &mut std::fmt::Formatter<'_>) -> std::fmt::Result {
                writeline!(f,"system_prefiz_for_linux {{")?;
                writeline!(f,"User {{ {:?} \n }} ", slef, users)?;
                writeline!(f,"keyboard_layout: {} {{ {:?} \n }} ", slef, users)?;
                writeline!(f,"User {{ {:?} \n }} ", slef, 
            )?;
                writeline!(f,"User {{ {:?} \n }} ", slef, users)?;

            }
        }
    }
        
}