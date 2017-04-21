# FoodTavern

A demo full stack system based on 5-tier clean architecture implemented at __package__ level, intended only for learning purposes.

![5 tier clean architecture](http://www.ovidiuconeac.ro/wp-content/uploads/2017/02/clean_architecture_layers_5_tier.png "5 tier clean architecture")

And MVP as presentation layer.

![Model View Presenter Design](http://www.ovidiuconeac.ro/wp-content/uploads/2017/03/model-view-presenter.png "Model View Presenter Design")

The system is composed of the following containers:
- Android client application
- Desktop client application
- Web client application
- RESTfull web service

The presentation layer is implemented by:
- Android client application
- Desktop client application
- Web client application

The API layer, Business layer, Data layer and Database layer are implemented at package level by:
- RESTfull web service

If you want to see a Maven module approach to clean architecture, based on the same system, see: [FoodTavern - v2.0](https://github.com/ovicon/FoodTavern/tree/v2.0).

Architecture
-------
You can read more about the system arhitecture modeling here: [The C4 Software Architecture Model in Action](http://www.ovidiuconeac.ro/2017/03/17/the-c4-software-architecture-model-in-action/).

Design
-------
You can read more about design considerations here: [Design Considerations After Architecture Modeling With C4](http://www.ovidiuconeac.ro/2017/04/05/design-considerations-after-architecture-modeling-with-c4/).

License
-------

    Copyright 2017 Ovidiu CONEAC

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
