package dungeonmania.goals.GoalConditions;

import dungeonmania.Game;
import dungeonmania.entities.collectables.Treasure;
import dungeonmania.goals.Goal;
import dungeonmania.goals.GoalConditionsInterface;

public class TreasureGoal implements GoalConditionsInterface {
    @Override
    public boolean playerHasWon(Game game, Goal goal) {
        return game.getInitialTreasureCount() - game.getMap().getEntities(Treasure.class).size() >= goal.getTarget();
    }

    @Override
    public String toString(Game game, Goal goal) {
        return ":treasure";
    }
}
