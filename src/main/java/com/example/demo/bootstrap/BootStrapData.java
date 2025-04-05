package com.example.demo.bootstrap;

import com.example.demo.domain.InhousePart;
import com.example.demo.domain.OutsourcedPart;
import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.repositories.InhousePartRepository;
import com.example.demo.repositories.OutsourcedPartRepository;
import com.example.demo.repositories.PartRepository;
import com.example.demo.repositories.ProductRepository;
import com.example.demo.service.OutsourcedPartService;
import com.example.demo.service.OutsourcedPartServiceImpl;
import com.example.demo.service.ProductService;
import com.example.demo.service.ProductServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

/**
 *
 *
 *
 *
 */
@Component
public class BootStrapData implements CommandLineRunner {

    private final PartRepository partRepository;
    private final ProductRepository productRepository;

    private final OutsourcedPartRepository outsourcedPartRepository;
    private final InhousePartRepository inhousePartRepository;

    public BootStrapData(PartRepository partRepository, ProductRepository productRepository, OutsourcedPartRepository outsourcedPartRepository, InhousePartRepository inhousePartRepository) {
        this.partRepository = partRepository;
        this.productRepository = productRepository;
        this.outsourcedPartRepository=outsourcedPartRepository;
        this.inhousePartRepository = inhousePartRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        long partsCount = partRepository.count();
        long productsCount = productRepository.count();

        if (partsCount == 0 && productsCount == 0) {

            OutsourcedPart outPartOne = new OutsourcedPart();
            outPartOne.setCompanyName("Eastern Motors");
            outPartOne.setName("150cc motor");
            outPartOne.setInv(5);
            outPartOne.setMinInv(0);
            outPartOne.setMaxInv(10);
            outPartOne.setPrice(400.0);
            outPartOne.setId(100L);
            outsourcedPartRepository.save(outPartOne);

            OutsourcedPart outPartTwo = new OutsourcedPart();
            outPartTwo.setCompanyName("Solar City Batteries");
            outPartTwo.setName("1000Wh battery");
            outPartTwo.setInv(5);
            outPartTwo.setMinInv(0);
            outPartTwo.setMaxInv(20);
            outPartTwo.setPrice(300.0);
            outPartTwo.setId(200L);
            outsourcedPartRepository.save(outPartTwo);

            OutsourcedPart outPartThree = new OutsourcedPart();
            outPartThree.setCompanyName("Superior Controls");
            outPartThree.setName("electric scooter controller");
            outPartThree.setInv(5);
            outPartThree.setMinInv(0);
            outPartThree.setMaxInv(30);
            outPartThree.setPrice(250.0);
            outPartThree.setId(300L);
            outsourcedPartRepository.save(outPartThree);

            InhousePart inPartOne = new InhousePart();
            inPartOne.setName("scooter deck");
            inPartOne.setPrice(100);
            inPartOne.setInv(5);
            inPartOne.setMinInv(0);
            inPartOne.setMaxInv(40);
            inPartOne.setPartId(10);
            inhousePartRepository.save(inPartOne);

            InhousePart inPartTwo = new InhousePart();
            inPartTwo.setName("scooter brakes multi-pack");
            inPartTwo.setPrice(50);
            inPartTwo.setInv(5);
            inPartTwo.setMinInv(0);
            inPartTwo.setMaxInv(50);
            inPartTwo.setPartId(20);
            inhousePartRepository.save(inPartTwo);

            Product scootyModel3= new Product("Scooty Model 3",1000.0,15);
            Product scootyModelY= new Product("Scooty Model Y",1300.0,12);
            Product scootyModelS= new Product("Scooty Model S",1600.0,10);
            Product scootyCyber= new Product("Scooty Model Cyber",2000.0,3);
            Product scootyModelPlaid= new Product("Scooty Model Plaid",2500.0,5);
            productRepository.save(scootyModel3);
            productRepository.save(scootyModelY);
            productRepository.save(scootyModelS);
            productRepository.save(scootyCyber);
            productRepository.save(scootyModelPlaid);

        }

//        OutsourcedPart thePart = null;
//        List<OutsourcedPart> outsourcedParts = (List<OutsourcedPart>) outsourcedPartRepository.findAll();
//        for(OutsourcedPart part:outsourcedParts){
//            if(part.getName().equals("150W motor")) thePart = part;
//        }
//
//        System.out.println(thePart.getCompanyName());

//        List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
//        for(OutsourcedPart part:outsourcedParts){
//            System.out.println(part.getName()+" "+part.getCompanyName());
//        }

        System.out.println("Started in Bootstrap");
        System.out.println("Number of Products "+productRepository.count());
        System.out.println(productRepository.findAll());
        System.out.println("Number of Parts "+partRepository.count());
        System.out.println(partRepository.findAll());

    }
}
