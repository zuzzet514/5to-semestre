pub struct User {
    name: String,
    password: String,
    is_sudoer: bool,
}
impl User {
    pub fn from(name: &str, password: &str, sudoer: bool) -> Self {
        Self {
            name: String::from(name),
            password: String::from(password),
            is_sudoer: sudoer,
        }
    }
}



impl std::fmt::Debug for User{
    fn fmt(&self, f: &mut std::fmt::Formatter<'_>) -> std::fmt::Result {
        writeln!(f,"user {{\n name: {}\n password: {}\n sudo: {}\n}}", self.get_name(), self.get_password(), self.get_sudoer())?;
        Ok(())
    }
}
