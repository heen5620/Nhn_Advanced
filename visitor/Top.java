package visitor;


interface Top {
    default void accept(Visitor e) {
        e.visit(this);
    }
}


class Left implements Top {

}


class Right implements Top {

}
