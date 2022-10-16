module com.my_application.main {
    requires transitive application;
    requires transitive domain;
    requires transitive common;
    requires transitive infrastructure;

    requires spring.boot;
    requires spring.boot.autoconfigure;
}
