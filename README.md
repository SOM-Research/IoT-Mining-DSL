# DSL for IoT systems in the underground coal mine industry
Repository to host a DSL for modeling multi-layered and self-adapting IoT systems for underground coal mines implemented in [MPS](https://www.jetbrains.com/es-es/mps/).

> _ This DSL (an extension of [our language](https://github.com/SOM-Research/selfadaptive-IoT-DSL) presented in this [paper](https://doi.org/10.1109/MODELS-C53483.2021.00122)) enables the modeling of the structure of an underground coal mine, the multilayer IoT system and the adaptation rules to guarantee QoS._

You can find in this repository the DSL implemented in MPS, a sandbox model of an example mine (Next figure shows the mine structure model) with an IoT system, including a control point, sensors, actuators, nodes (edge, fog, and cloud), and adaptation rules. You can also find the generated code for K3S (lightweight Kubernetes distribution) in [this directory](https://github.com/SOM-Research/IoT-Mining-DSL/tree/main/languages/Mining/sandbox/source_gen/Mining/sandbox).

<img src="/docs/img/mine-structure-model.png" alt="Mine structure model" style="height: 100%; width:100%;"/>

The metamodel (abstract syntax) of the DSL is summarised in the following figure.

<img src="/docs/img/metamodel.png" alt="Metamodel" style="height: 100%; width:100%;"/>

## Documentation

* [Installation guide](https://github.com/SOM-Research/IoT-Mining-DSL/tree/main/docs/installation-guide.pdf)
* [Generated code example](https://github.com/SOM-Research/IoT-Mining-DSL/tree/main/docs/code-example)

## Publications and Other Resources

* Alfonso, I., Garcés, K., Castro, H., & Cabot, J. (2021, October). Modeling self-adaptative IoT architectures. In 2021 ACM/IEEE International Conference on Model Driven Engineering Languages and Systems Companion. https://doi.org/10.1109/MODELS-C53483.2021.00122

* Modeling self-adaptive IoT architectures. Post in [modeling-languajes](https://modeling-languages.com/modeling-self-adaptative-iot-architectures/)

* Alfonso, I., Garcés, K., Castro, H., & Cabot, J. Modelado de Sistemas IoT para la Industria en Minerıa Subterránea de Carbón. Actas de las XXVI Jornadas de Ingeniería del Software y Bases de Datos (JISBD 2022), Sistedes, 2022. http://hdl.handle.net/11705/JISBD/2022/8557 (only in Spanish).

* Modelando Sistemas IoT para la Industria Minera - Ejemplo de Creación de un Lenguaje Específico de Dominio. Post in [Ingeniería de Software](https://ingenieriadesoftware.es/modelando-sistemas-iot-para-la-industria-minera-ejemplo-de-creacion-de-un-lenguaje-especifico-de-dominio/) (only in Spanish).