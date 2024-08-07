// Object * 32 Eri A  ---  Star  ---  OID=@11631863   (@@-1,255)  ---  coobox=6217 
// Object types: Double or Multiple Star,Star,Infra-Red Source,X-ray Source 
Star "32 Eri A/Gaia DR3 3247046373003772032/TYC 4721-1218-1/PLX 863/ADS 2850 A/BD-03 631A/CSI-03 631 1/GC 4706/GCRV 2238/GEN# +1.00024555A/HD 24555/HR 1212/IRC +00051/JP11 835/PPM 186311/RBS 491/ROT 580/SAO 130806/SKY# 5970/UBV M 9806/YPAC 326/[ATZ98] A089/1RXS J035417.2-025711/RX J0354.2-0257/CCDM J03543-0257A/WDS J03543-0257A/WEB 3526/Gaia DR2 3247046373003772032"
{
	DateUpdated     "2024-07-02"
	ParentBody      "32 Eri"
	Parallax        9.4562
	AppMagn         4.7
	Class           "G6.5III"
	AbsMagn         -0.42 // 计算的值

	BinaryOrbit     
	{
		Separation      659.309035623199 // 6.87 asec
	}
}

// Object * 32 Eri B  ---  Star  ---  OID=@9042711   (@@-1,255)  ---  coobox=6217 
// Object types: Double or Multiple Star,Star 
Star "32 Eri B/Gaia DR3 3247049327941271424/TYC 4721-1217-1/GSC 04721-01217/** STF 470B/ADS 2850 B/BD-03 631B/CCDM J03543-0257B/CSI-03 631 2/GC 4705/GCRV 2237/GEN# +1.00024554/HD 24554/HGAM 305/HR 1211/IDS 03493-0315 B/ROT 579/SAO 130805/UBV M 9805/WDS J03543-0257B/WEB 3525/UCAC4 436-005299/Gaia DR2 3247049327941271424"
{
	DateUpdated     "2024-07-02"
	ParentBody      "32 Eri"
	Parallax        9.6777
	AppMagn         6.09
	Class           "A1V"
	AbsMagn         1.02 // 计算的值
	MassKg          3.32479988594809e+30 // log(g) = 3.91 cm/s^2
	RadSol          2.375 // Gaia DR3
	LumBol          37.6401315492766 // 计算的值
	Teff            9277
	FeH             -0.789
}

// Object * omi02 Eri  ---  Eruptive Variable  ---  OID=@702026   (@@143735,0)  ---  coobox=6265 
// Object types: Rotating Variable,Eruptive Variable,High Proper Motion Star,Double or Multiple Star,Eruptive Variable,Near-IR Source (λ < 3 µm),Mid-IR Source (3 to 30 µm),Variable Star,High Proper Motion Star,Star,Star,Star,Infra-Red Source,UV-emission Source,X-ray Source 
// NoirLab: https://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=19849
Remove "Keid A"{ParentBody "Keid"}
Remove "Keid (BC)"{ParentBody "Keid"}
Remove "Keid B"{ParentBody "Keid (BC)"}
Remove "Keid C"{ParentBody "Keid (BC)"}
Remove "HD 26965 b"{ParentBody "HD 26965"}
Star "OMI2 Eri A"
{
	DateUpdated     "2024-07-02"
	ParentBody      "OMI2 Eri"
	Class           "K0.5V"
	AbsMagn         5.93
	MassSol         0.78
	RadSol          0.812
	LumBol          0.457
	Teff            5072
	FeH             -0.42
	RotationPeriod  888 // 37 - 43 days
	Age             6.9
}

Barycenter "OMI2 Eri BC"
{
	ParentBody      "OMI2 Eri"
	BinaryOrbit     
	{
		Period          8000
		Separation      400
	}
}

// Object * omi02 Eri B  ---  White Dwarf  ---  OID=@701944   (@@15528,0)  ---  coobox=6265 
// Object types: White Dwarf,High Proper Motion Star,Double or Multiple Star,Variable Star,Near-IR Source (λ < 3 µm),Star,White Dwarf Candidate,X-ray Source 
Star "OMI2 Eri B/GJ 166 B/Gaia DR3 3195919254111315712/2MASS J04152196-0739254/40 Eri B/2E 957/8pc 198.24B/AAVSO 0410-07C/ADS 3093 B/BD-07 781/CCDM J04153-0739B/CSI-07 781 1/Ci 20 289/EGGR 33/G 160-60/GC 5140/GCRV 2441/GEN# +1.00026976B/HD 26976/LFT 339/LHS 24/LP 7-781 A/LPM 182/LTT 1908/NLTT 12868/SAO 131065/UBV 4141/UBV M 10045/UCAC2 29035414/WD 0413-07/WD 0413-077/WD 0413-074/Zkh 59/2E 0412.9-0745/WDS J04153-0739B/** STF 518B/PMSC 04107-0748B/WEB 3795/Gaia DR2 3195919254110817408"
{
	DateUpdated     "2024-07-02"
	ParentBody      "OMI2 Eri BC"
	Parallax        199.6911
	AppMagn         9.53
	Class           "DA2.9"
	AbsMagn         11.03 // 计算的值
	MassSol         0.573
	RadSol          0.014
	LumBol          0.013
	Teff            16500

	BinaryOrbit // VB6_Izm2019  STF_518BC Gr.3
	{
		Period          222.7396
		Separation      35
		Eccentricity    0.451
		Inclination     107.0
		AscendingNode   151.1
		Epoch           2396113.185857902746648
		ArgOfPericenter 134.7
		MeanAnomaly     0
	}
}

// Object * omi02 Eri C  ---  Eruptive Variable  ---  OID=@701829   (@@15521,0)  ---  coobox=6265 
// Object types: High Proper Motion Star,Eruptive Variable,Near-IR Source (λ < 3 µm),Variable Star,Double or Multiple Star,Mid-IR Source (3 to 30 µm),Star,UV-emission Source,X-ray Source 
Star "OMI2 Eri C/GJ 166 C/Gaia DR3 3195919254111314816/TIC 67772873/V* DY Eri/40 Eri C/2RE J041521-073855/2RE J0415-073/8pc 198.24C/AAVSO 0410-07D/ADS 3093 C/BD-07 781C/CCDM J04153-0739C/CSI-07 781 2/GCRV 2442/GEN# +1.00026976C/LFT 340/LHS 25/LTT 1909/NLTT 12869/RE J0415-073/RE J041520-073853/UBV 4142/Zkh 60/[RHG95] 742/2MASS J04152173-0739173/WDS J04153-0739C/** STF 518C/Gaia DR2 3195919322830293760/PMSC 04107-0748C/WISEA J041519.99-073955.6/WEB 3796/Karmn J04153-076"
{
	DateUpdated     "2024-07-02"
	ParentBody      "OMI2 Eri BC"
	Parallax        199.4516
	AppMagn         11.17
	Class           "M4.5V"
	AbsMagn         12.67 // 计算的值
	MassSol         0.271
	RadSol          0.298
	LumBol          0.00651
	Teff            3100
	Age             1.8 // 5.6
}

// Object * omi02 Eri b  ---  Not an Object (Error, Artefact, ...)  ---  OID=@11953838   (@@-1,255)  ---  coobox=6265
// Object types: Extra-solar Planet,Star,Extra-solar Planet Candidate,Not an Object (Error, Artefact, ...)
Planet "OMI2 Eri Ab/HD 26965 Ab"
{
	ParentBody     "OMI2 Eri A"
	DiscMethod     "RadVel"
	DiscDate       "2018"
	Mass           8.47

	Orbit
	{
		PeriodDays      42.378
		SemiMajorAxis   0.215
		Eccentricity    0.04
		ArgOfPericen    148.969
	}
}

// Object * 51 Eri b  ---  Extra-solar Planet  ---  OID=@9647572   (@@-1,255)  ---  coobox=6403
// Object types: Extra-solar Planet,Star,Extra-solar Planet Candidate
Planet "51 Eri b"
{
	ParentBody     "51 Eri"
	DiscMethod     "Imaging"
	DiscDate       "2015"
	Class          "GasGiant"
	MassJup        2.6
	Radius         79356.12

	Orbit
	{
		Epoch           2452014.79
		PeriodDays      10260
		SemiMajorAxis   11.1
		Eccentricity    0.49
		Inclination     136.0
		ArgOfPericen    84.0
	}
}