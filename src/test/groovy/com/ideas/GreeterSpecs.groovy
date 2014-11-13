package com.ideas

import spock.lang.Specification

class GreeterSpecs extends Specification {

    def "I will greet you"() {
        given:'a greeter'
            def greeter = new Greeter()

        when: 'i want to greet'
            def message = greeter.greet('Harry')

        then: 'harry must be greeted'
            message == 'Hello Harry'
    }

    def "I will greet you many times"() {
        given:'a greeter'
            def greeter = new Greeter()

        expect: 'i want to greet people'
            expectedMessage == greeter.greet(who)

        where: 'people are...'
            who    | expectedMessage
            'Harry'| 'Hello Harry'
            'Sally'| 'Hello Sally'
            ''     | 'Hello'



    }


}
