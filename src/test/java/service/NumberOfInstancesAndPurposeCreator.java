package service;

import model.NumberOfInstancesAndPurpose;

public class NumberOfInstancesAndPurposeCreator {
    public static final String NUMBER_OF_INSTANCES = "testdata.instances.numberOfInstances";
    public static final String WHAT_ARE_THESE_INSTANCES_FOR = "testdata.instances.whatAreTheseInstancesFor";

    public static NumberOfInstancesAndPurpose withCredentialsFromProperty() {
        return new NumberOfInstancesAndPurpose(TestDataReader.getTestData(NUMBER_OF_INSTANCES), TestDataReader.getTestData(WHAT_ARE_THESE_INSTANCES_FOR));
    }

    public static NumberOfInstancesAndPurpose withEmptyPurpose() {
        return new NumberOfInstancesAndPurpose(TestDataReader.getTestData(NUMBER_OF_INSTANCES), "");
    }

    public static NumberOfInstancesAndPurpose withEmptyNumberOfInstance() {
        return new NumberOfInstancesAndPurpose("", TestDataReader.getTestData(WHAT_ARE_THESE_INSTANCES_FOR));
    }
}
