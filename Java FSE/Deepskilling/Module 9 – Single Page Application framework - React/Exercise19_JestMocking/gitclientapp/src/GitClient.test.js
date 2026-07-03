import axios from "axios";
import GitClient from "./GitClient";

jest.mock("axios");

describe("Git Client Tests", () => {

    test("should return repository names for techiesyed", async () => {

        const repositories = [

            { name: "RepoOne" },

            { name: "RepoTwo" }

        ];

        axios.get.mockResolvedValue({

            data: repositories

        });

        const response = await GitClient.getRepositories("techiesyed");

        expect(response.data).toEqual(repositories);

        expect(axios.get).toHaveBeenCalledWith(
            "https://api.github.com/users/techiesyed/repos"
        );

    });

});