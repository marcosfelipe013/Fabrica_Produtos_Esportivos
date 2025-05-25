import java.util.Scanner;


interface CamisaEsportiva {
    String getMarca();
    String getNomeTime();
    void exibirInformacoes();
}

class CamisaNike implements CamisaEsportiva {
    private String nomeTime;

    public CamisaNike(String nomeTime) {
        this.nomeTime = nomeTime;
    }

    @Override
    public String getMarca() {
        return "Nike";
    }

    @Override
    public String getNomeTime() {
        return nomeTime;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Camisa da marca: " + getMarca() + ", Time: " + getNomeTime());
    }
}

class CamisaAdidas implements CamisaEsportiva {
    private String nomeTime;

    public CamisaAdidas(String nomeTime) {
        this.nomeTime = nomeTime;
    }

    @Override
    public String getMarca() {
        return "Adidas";
    }

    @Override()
    public String getNomeTime() {
        return nomeTime;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Camisa da marca: " + getMarca() + ", Time: " + getNomeTime());
    }
}

class CamisaPuma implements CamisaEsportiva {
    private String nomeTime;

    public CamisaPuma(String nomeTime) {
        this.nomeTime = nomeTime;
    }

    @Override
    public String getMarca() {
        return "Puma";
    }

    @Override
    public String getNomeTime() {
        return nomeTime;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Camisa da marca: " + getMarca() + ", Time: " + getNomeTime());
    }
}

class CamisaUmbro implements CamisaEsportiva {
    private String nomeTime;

    public CamisaUmbro(String nomeTime) {
        this.nomeTime = nomeTime;
    }

    @Override
    public String getMarca() {
        return "Umbro";
    }

    @Override
    public String getNomeTime() {
        return nomeTime;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Camisa da marca: " + getMarca() + ", Time: " + getNomeTime());
    }
}

class CamisaKappa implements CamisaEsportiva {
    private String nomeTime;

    public CamisaKappa(String nomeTime) {
        this.nomeTime = nomeTime;
    }

    @Override
    public String getMarca() {
        return "Kappa";
    }

    @Override
    public String getNomeTime() {
        return nomeTime;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Camisa da marca: " + getMarca() + ", Time: " + getNomeTime());
    }
}


interface FabricaEsportiva {
    CamisaEsportiva criarCamisa(String nomeTime);
}


class FabricaNike implements FabricaEsportiva {
    @Override
    public CamisaEsportiva criarCamisa(String nomeTime) {
        if (nomeTime.equalsIgnoreCase("Brasil")) {
            return new CamisaNike(nomeTime);
        } else {
            System.out.println("A Nike não fabrica camisa para o time: " + nomeTime);
            return null;
        }
    }
}

class FabricaAdidas implements FabricaEsportiva {
    @Override
    public CamisaEsportiva criarCamisa(String nomeTime) {
        if (nomeTime.equalsIgnoreCase("Flamengo")) {
            return new CamisaAdidas(nomeTime);
        } else {
            System.out.println("A Adidas não fabrica camisa para o time: " + nomeTime);
            return null;
        }
    }
}

class FabricaPuma implements FabricaEsportiva {
    @Override
    public CamisaEsportiva criarCamisa(String nomeTime) {
        if (nomeTime.equalsIgnoreCase("Botafogo")) {
            return new CamisaPuma(nomeTime);
        } else {
            System.out.println("A Puma não fabrica camisa para o time: " + nomeTime);
            return null;
        }
    }
}

class FabricaUmbro implements FabricaEsportiva {
    @Override
    public CamisaEsportiva criarCamisa(String nomeTime) {
        if (nomeTime.equalsIgnoreCase("Fluminense")) {
            return new CamisaUmbro(nomeTime);
        } else {
            System.out.println("A Umbro não fabrica camisa para o time: " + nomeTime);
            return null;
        }
    }
}

class FabricaKappa implements FabricaEsportiva {
    @Override
    public CamisaEsportiva criarCamisa(String nomeTime) {
        if (nomeTime.equalsIgnoreCase("Vasco")) {
            return new CamisaKappa(nomeTime);
        } else {
            System.out.println("A Kappa não fabrica camisa para o time: " + nomeTime);
            return null;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha a marca da camisa desejada (Nike, Adidas, Puma, Umbro, Kappa):");
        String marcaEscolhida = scanner.nextLine();

        System.out.println("Escolha o time da camisa desejada:");
        String timeEscolhido = scanner.nextLine();

        FabricaEsportiva fabrica = null;

        switch (marcaEscolhida.toLowerCase()) {
            case "nike":
                fabrica = new FabricaNike();
                break;
            case "adidas":
                fabrica = new FabricaAdidas();
                break;
            case "puma":
                fabrica = new FabricaPuma();
                break;
            case "umbro":
                fabrica = new FabricaUmbro();
                break;
            case "kappa":
                fabrica = new FabricaKappa();
                break;
            default:
                System.out.println("Fábrica esportiva não reconhecida.");
                scanner.close();
                return;
        }

        if (fabrica != null) {
            CamisaEsportiva camisa = fabrica.criarCamisa(timeEscolhido);
            if (camisa != null) {
                System.out.println("\nProduto escolhido:");
                camisa.exibirInformacoes();
                System.out.println("Fábrica: " + camisa.getMarca());
            }
        }

        scanner.close();
    }
}