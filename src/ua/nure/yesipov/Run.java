package ua.nure.yesipov;

import jade.core.Profile;
import jade.core.ProfileImpl;
import jade.util.leap.Properties;
import jade.wrapper.AgentContainer;
import ua.nure.yesipov.agent.WorldAgent;
import ua.nure.yesipov.agent.NavigatorAgent;
import ua.nure.yesipov.agent.SpeleologistAgent;

import static jade.core.Runtime.instance;

public class Run {
    public static void main(String[] args) throws Exception {
        Properties properties = new Properties();
        properties.setProperty(Profile.GUI, Boolean.TRUE.toString());

        Profile profile = new ProfileImpl(properties);
        AgentContainer agentContainer = instance().createMainContainer(profile);

        agentContainer.acceptNewAgent(WorldAgent.class.getSimpleName(), new WorldAgent()).start();
        agentContainer.acceptNewAgent(NavigatorAgent.class.getSimpleName(), new NavigatorAgent()).start();
        agentContainer.acceptNewAgent(SpeleologistAgent.class.getSimpleName(), new SpeleologistAgent()).start();
    }
}
