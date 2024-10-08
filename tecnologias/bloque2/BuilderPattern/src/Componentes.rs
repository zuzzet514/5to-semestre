pub struct User {
    name: string,
    password: string,
    is_sudoer: bool

    impl User {
        pub fn from(tilin: &str, password: &str, sudoer: bool) -> self {
            self {
                name: String::from(tilin),
                password: String::from(password),
                sudoer: sudoer
            }
        }

        pub fn get_name(self)-> string{
            String::from(&self.name)
        }

        pub fn get_password(self)-> string{
            String::from(&self.password)
        }

        pub fn get_sudoer(self)-> bool {
            self.sudoer
        }
    }

}