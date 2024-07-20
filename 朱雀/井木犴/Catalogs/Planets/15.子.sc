// Object * gam Col  ---  Pulsating Variable  ---  OID=@849404   (@@12781,5)  ---  coobox=7127 
// Object types: Pulsating Variable,Near-IR Source (λ < 3 µm),Double or Multiple Star,Variable Star,Star,Infra-Red Source,UV-emission Source 
Remove "GAM Col A" {ParentBody "GAM Col"}
Remove "GAM Col B" {ParentBody "GAM Col"}
Star "GAM Col A"
{
	DateUpdated     "2024-07-20"
	ParentBody      "HIP 28199"
	Class           "B2.5IV"
	AbsMagn         -2.76
	MassSol         5.7
	RadSol          4.8
	LumBol          2070
	Teff            15570
	Age             0.0236

	BinaryOrbit     
	{
		Separation      8844
	}
}

// Object V* BD Col  ---  Rotating Variable  ---  OID=@849405   (@@12781,6)  ---  coobox=7127 
// Object types: Rotating Variable,Near-IR Source (λ < 3 µm),Variable Star,Double or Multiple Star,Star 
Star "V* BD Col/Gaia DR3 2887631483766714496/TIC 143108996/CCDM J05575-3517B/CD-35 2612B/CSI-35 2612 22/HD 40494B/IDS 05540-3518 B/WDS J05575-3517B/** HJ 3819B/Gaia DR2 2887631483766714496/UCAC4 274-008329/2MASS J05573480-3517115"
{
	DateUpdated     "2024-07-20"
	ParentBody      "HIP 28199"
	Parallax        3.4487
	AppMagn         12.66
	Class           "G8V"
	AbsMagn         5.35 // 计算的值
	MassSol         0.94
	Teff            5367
}
